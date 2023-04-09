package com.hibernateSpringLearning.hibernatePart2;

import com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta.Check;
import com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta.Credit;
import com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta.Payment;
import com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta.PaymentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

@SpringBootTest
class HibernatePart2ApplicationTests {
	@Autowired
	EmpRepo er;
	 @Autowired
	PaymentRepo pr;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee em=new Employee();
//		em.setId(1);
		em.setFirstName("kritka");
		em.setLastName("pharswal");
		em.setEmpSalary(1500);
		em.setAge(22);


		Employee em1=new Employee();
//		em1.setId(2);
		em1.setFirstName("hema");
		em1.setLastName("patidar");
		em1.setEmpSalary(1500);
		em1.setAge(23);

		Employee em2=new Employee();
//		em2.setId(3);
		em2.setFirstName("mansi");
		em2.setLastName("agarwal");
		em2.setEmpSalary(1500);
		em2.setAge(22);

		er.save(em);
		er.save(em1);
		er.save(em2);

	}

	@Test
	public void testFindAllEmp(){
		System.out.println(er.findallEmployees());
	}

	@Test
	public void testFindPartialData(){
		List<Object[]> partial =er.findPartialData();
		for( Object[] ob: partial){
			System.out.println(ob[0]);
			System.out.println(ob[1]);
		}
	}

	@Test
	public void testfindEmployeeByFirstName(){
		System.out.println(er.findEmployeeByFirstName("kritika"));
	}

	@Test
	public void createSingleTest(){
		Credit c1=new Credit();
		c1.setCreditcard("234566");
		c1.setAmount(200);
		c1.setId(1);
		pr.save(c1);

	}



}
