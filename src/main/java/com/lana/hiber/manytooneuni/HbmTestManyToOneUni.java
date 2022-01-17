package com.lana.hiber.manytooneuni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmTestManyToOneUni {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(EmployeeMU.class)
                .addAnnotatedClass(DepartmentMU.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            EmployeeMU emp1 = new EmployeeMU("Tim", "Lanenko",  30000);
            EmployeeMU emp2 = new EmployeeMU("Mike", "Lee",  120000);
            DepartmentMU dep = new DepartmentMU("HR", 200000, 20000);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();
        }
    }
}
