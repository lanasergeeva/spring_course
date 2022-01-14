package com.lana.hiber.entity.bidir;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HmbTestBiDir {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(EmployeeT.class)
                .addAnnotatedClass(DetailT.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
      /*      EmployeeT emp = new EmployeeT("Pavel", "Lee", "IT", 150000);
            DetailT detail1 = new DetailT("Minsk", "89998899888", "pa@mail.ru");
            emp.setDetails(detail1);
            detail1.setEmployee(emp);*/
            session.beginTransaction();
            DetailT detail = session.get(DetailT.class, 2);
            System.out.println(detail.getEmployee());
            session.getTransaction().commit();
        }
    }
}
