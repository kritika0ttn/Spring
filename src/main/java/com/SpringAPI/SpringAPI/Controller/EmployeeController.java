package com.SpringAPI.SpringAPI.Controller;

import com.SpringAPI.SpringAPI.Entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@RestController
public class EmployeeController {

    List<Employee> list=new ArrayList<>();

    EmployeeController(){
        list.add(new Employee(1,"Kritika","Trainee"));
        list.add(new Employee(2,"hema","Trainee"));
        list.add(new Employee(3,"rashi","Trainee"));
    }
    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return list;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Predicate<? super Employee> predicate = emp ->
            emp.getId()==id;
        return (list.stream().filter(predicate).findFirst().get());
    }

    @DeleteMapping ("/employee/{id}")
    public void DeleteEmployeeById(@PathVariable int id){
        Predicate<? super Employee> predicate = emp -> emp.getId()==id;
        list.removeIf(predicate);
    }

    @PostMapping("/employee")
    public void createEmployee(@RequestBody Employee emp){
        list.add(emp);
    }



}
