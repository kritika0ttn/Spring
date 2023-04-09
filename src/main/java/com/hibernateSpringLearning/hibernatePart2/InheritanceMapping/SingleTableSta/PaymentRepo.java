package com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PaymentRepo extends CrudRepository<Payment,Integer> {

}

