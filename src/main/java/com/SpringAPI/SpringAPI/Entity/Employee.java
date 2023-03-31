package com.SpringAPI.SpringAPI.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Employee {
    int id;
    String empName;
    String empDes;

    public Employee(){
        super();
    }

    public Employee(int id, String empName, String empDes) {
        this.id = id;
        this.empName = empName;
        this.empDes = empDes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDes() {
        return empDes;
    }

    public void setEmpDes(String empDes) {
        this.empDes = empDes;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empDes='" + empDes + '\'' +
                '}';
    }
}
