package com.lana.hiber.entity.bidir;

import javax.persistence.*;

@Entity
@Table(name = "employeesBi")
public class EmployeeT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private int salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_Id")
    private DetailT details;

    public EmployeeT() {
    }

    public EmployeeT(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public EmployeeT(String name, String surname, String department, int salary, DetailT details) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public DetailT getDetails() {
        return details;
    }

    public void setDetails(DetailT details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "EmployeeT{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", department='" + department + '\''
                + ", salary=" + salary
                + ", details=" + details
                + '}';
    }
}
