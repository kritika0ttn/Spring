package com.SpringHibernate.Hibernate.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> , PagingAndSortingRepository<Employee,Integer> {
    List<Employee> findByName(String name);
    List<Employee> findByAgeBetween(int age1,int age2);

    List<Employee> findByNameLike(String name);
}

