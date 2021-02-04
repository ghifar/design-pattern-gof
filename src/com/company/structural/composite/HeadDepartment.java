package com.company.structural.composite;

import java.util.ArrayList;
import java.util.List;

//As composite pattern yang menggabungkan
public class HeadDepartment implements Department {
    private int id;
    private String name;
    private List<Department> childDept;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDept = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDept.forEach(Department::printDepartmentName);
    }

    public void addDept(Department department) {
        childDept.add(department);
    }

    public void removeDept(Department department) {
        childDept.remove(department);
    }
}
