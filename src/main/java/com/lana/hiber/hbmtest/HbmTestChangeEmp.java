package com.lana.hiber.hbmtest;

import com.lana.hiber.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HbmTestChangeEmp {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update from EmployeeT set salary=175000"
                            + "where name like '%m%'")
                    .executeUpdate();
      /*      Employee emp = session.get(Employee.class, 2);
            emp.setSalary(75000);*/
            session.getTransaction().commit();

        }
    }
}
