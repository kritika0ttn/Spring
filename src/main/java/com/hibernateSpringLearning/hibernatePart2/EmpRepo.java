package com.hibernateSpringLearning.hibernatePart2;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface EmpRepo extends CrudRepository<Employee,Integer>{

    @Query("from Employee")
    List<Employee> findallEmployees();

    @Query("Select e.firstName,e.lastName from Employee e")
    List<Object[]> findPartialData();

    @Query("from Employee where firstName='firstName'")
    List<Employee> findEmployeeByFirstName(@Param("firstName") String firstName);

//    @Query("from Employee where empSalary> avg(empSalary)


}
