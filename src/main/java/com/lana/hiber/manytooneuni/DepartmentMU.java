package com.lana.hiber.manytooneuni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class DepartmentMU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "departments_id")
    private List<EmployeeMU> allEmployees;

    public DepartmentMU() {
    }

    public DepartmentMU(String name, int maxSalary, int minSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(EmployeeMU employee) {
        if (allEmployees == null) {
            allEmployees = new ArrayList<>();
        }
        allEmployees.add(employee);
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
