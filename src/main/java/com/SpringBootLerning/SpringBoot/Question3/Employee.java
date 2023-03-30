package com.SpringBootLerning.SpringBoot.Question3;


import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long empId;
    public String empName;
    public String empEmail;

    public Employee() {
        super();
    }

    public Employee(Long empId, String empName, String empEmail) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
    }
    public Long getEmpId() {
        return empId;
    }
    public void setEmpId(Long empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpEmail() {
        return empEmail;
    }
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + "]";
    }



}