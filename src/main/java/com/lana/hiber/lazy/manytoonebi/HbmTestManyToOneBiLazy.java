package com.lana.hiber.lazy.manytoonebi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbmTestManyToOneBiLazy {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(EmployeeL.class)
                .addAnnotatedClass(DepartmentL.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
           /* EmployeeL emp1 = new EmployeeL("Tim", "Lanenko",  50000);
            EmployeeL emp2 = new EmployeeL("Mike", "Lee",  100000);
            EmployeeL emp3 = new EmployeeL("Oleg", "Plov",  100000);
            DepartmentL dep = new DepartmentL("Sales", 150000, 20000);
            dep.addEmployeeToDepartment(emp3);*/
            //dep.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            System.out.println("Get department");
            DepartmentL departmentL = session.get(DepartmentL.class, 1);
            System.out.println("show departments");
            System.out.println(departmentL);
            System.out.println("show employees of the department");
            System.out.println(departmentL.getAllEmployees());
            session.getTransaction().commit();

            /*session.beginTransaction();
            System.out.println("Get department");
            DepartmentL departmentL = session.get(DepartmentL.class, 1);
            System.out.println("show departments");
            System.out.println(departmentL);
            session.getTransaction().commit();

            System.out.println("show employees of the department");
            System.out.println(departmentL.getAllEmployees());
            LazyInitializationException так как
            сессия закрыта и мы не можем подгрузить инфомацию о работниках
            Чтобы этого было можно подгрузить данные дло коммита,
            к примеру, department.getEmps.get(0)*/
        }
    }
}
