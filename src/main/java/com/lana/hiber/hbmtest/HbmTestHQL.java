package com.lana.hiber.hbmtest;

import com.lana.hiber.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HbmTestHQL {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> all = session.createQuery("from EmployeeT").getResultList();
            System.out.println(all);
            List<Employee> allA =
                    session.createQuery("from EmployeeT where name like '%a%'")
                            .getResultList();
            System.out.println(allA);
            Employee emp = session.get(Employee.class, 3);
            session.getTransaction().commit();
            System.out.println(emp);
        }
    }
}
