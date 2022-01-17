package com.lana.hiber.manytoonebi;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class DepartmentM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<EmployeeM> allEmployees;

    public DepartmentM() {
    }

    public DepartmentM(String name, int maxSalary, int minSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(EmployeeM employee) {
        if (allEmployees == null) {
            allEmployees = new ArrayList<>();
        }
        allEmployees.add(employee);
        employee.setDepartment(this);
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

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    @Override
    public String toString() {
        return "DepartmentM{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", maxSalary=" + maxSalary
                + ", minSalary=" + minSalary
                + '}';
    }
}
