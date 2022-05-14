package lesson_hibernate;

import lesson_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession(); //создание сессии
            session.beginTransaction(); //начало транзакции
            System.out.println("Beggin");

            List<Employee> emps = session.createQuery("from Employee where name = 'Bob1'", Employee.class)
                    .getResultList();

            for (Employee e : emps){
                System.out.println(e);
            }

            System.out.println("Пока живой");

            session.getTransaction().commit();

            System.out.println("Done");

        }finally {
            factory.close();
        }
    }
}
