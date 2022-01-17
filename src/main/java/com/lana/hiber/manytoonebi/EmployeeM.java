package com.lana.hiber.manytoonebi;

import javax.persistence.*;

@Entity
@Table(name = "employeesM")
public class EmployeeM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "salary")
    private int salary;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departments_id")
    private DepartmentM department;

    public EmployeeM() {
    }

    public EmployeeM(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
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

    public DepartmentM getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentM department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeM{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", department='" + department + '\''
                + ", salary=" + salary
                + ", department=" + department
                + '}';
    }
}
