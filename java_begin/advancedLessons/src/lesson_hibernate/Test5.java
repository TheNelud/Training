package lesson_hibernate;

import lesson_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession(); //создание сессии
            session.beginTransaction(); //начало транзакции
            System.out.println("Beggin");

            //для одного чувака
//            Employee emp = session.get(Employee.class, 11);
//            session.delete(emp);

            session.createQuery("delete Employee " +
                    "where name = 'Bob1'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done");

        }finally {
            factory.close();
        }
    }
}
