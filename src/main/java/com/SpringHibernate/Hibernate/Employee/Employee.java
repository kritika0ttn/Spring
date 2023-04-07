package com.SpringHibernate.Hibernate.Employee;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
    private  String name;
    @Id
    private int id;
    private int age;

    private  String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(String name, int id, int age, String location) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.location = location;
    }

    public Employee() {
    }
}
