package com.lana.hiber.manytoonebi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmTestManyToOneBi {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(EmployeeM.class)
                .addAnnotatedClass(DepartmentM.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            EmployeeM emp1 = new EmployeeM("Tim", "Lanenko",  50000);
            EmployeeM emp2 = new EmployeeM("Mike", "Lee",  100000);
            DepartmentM dep = new DepartmentM("It", 599500, 50000);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();
        }
    }
}
