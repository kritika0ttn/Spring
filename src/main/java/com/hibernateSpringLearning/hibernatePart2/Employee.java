package com.hibernateSpringLearning.hibernatePart2;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Employee {
    //    id, firstName, lastName, salary, age
    //empId, empFirstName, empLastName, empSalary, empAge.
    @Id
    @Column(name = "empId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="empFirstName")
    private String firstName;
    @Column(name="empLastName")
    private String lastName;
    @Column(name="empSalary")
    private long salary;
    @Column(name="empAge")
    private int age;


    public Employee() {
    }
    public Employee(int id, String firstName, String lastName, long salary, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getEmpSalary() {
        return salary;
    }

    public void setEmpSalary(long empSalary) {
        this.salary = empSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
