package com.lana.hiber.lazy.manytoonebi;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departmentsLazy")
public class DepartmentL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department", fetch = FetchType.LAZY)
    private List<EmployeeL> allEmployees;

    public DepartmentL() {
    }

    public DepartmentL(String name, int maxSalary, int minSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(EmployeeL employee) {
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

    public List<EmployeeL> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(List<EmployeeL> allEmployees) {
        this.allEmployees = allEmployees;
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
