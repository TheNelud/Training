package lesson_hibernate;

import lesson_hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Eleena", "Petrova", "IT",  500);

            session.beginTransaction();
            session.save(employee); //запись в базу
            session.getTransaction().commit();

            int myId = employee.getId(); //id работника которого добавили сейчас
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employeeGet = (Employee) session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employeeGet);

            System.out.println("Done");

        }finally {
            factory.close();
        }



    }
}
