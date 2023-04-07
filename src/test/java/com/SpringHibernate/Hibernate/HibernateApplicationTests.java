package com.SpringHibernate.Hibernate;

import com.SpringHibernate.Hibernate.Employee.Employee;
import com.SpringHibernate.Hibernate.Employee.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class HibernateApplicationTests {
	@Autowired
	EmployeeRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee emp = new Employee("kritika",1,22,"najafgarh");
		Employee emp1 = new Employee("hema",2,23,"kargoan");
		repo.save(emp);
		repo.save(emp1);
	}

	@Test
	void add() {
		Employee e1 = new Employee( "moksh",3, 1, "Delhi");
		repo.save(e1);

	}

	@Test
	public void read() {
		Employee e1 = repo.findById(1).get();
		assertNotNull(e1);
		assertEquals("Kritika", e1.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>" + e1.getLocation());

	}

	@Test
	public void testupdate() {
		Employee e1 = repo.findById(2).get();
		e1.setAge(29);
		repo.save(e1);
		assertEquals(29,e1.getAge());
	}

	@Test
	public void testDelete() {
		repo.deleteById(1);
	}

	@Test
	public void textcount() {
		System.out.println("#############" + repo.count());
	}

	@Test
	public void testfindByname() {
		List<Employee> emp = repo.findByName("moksh");
		emp.forEach(p->assertEquals("moksh", p.getName()));
	}

	@Test
	public void testfindagebetween() {
		List<Employee> emp = repo.findByAgeBetween(28, 30);
		emp.forEach(e->System.out.println(e.getName()));
	}

	@Test
	public void testfindbyLike() {
		List<Employee> emp = repo.findByNameLike("k%");
		emp.forEach(e -> System.out.println(e.getId() + "     " + e.getName() + "      " + e.getLocation() + "       " + e.getAge()));
		emp.forEach(e->assertEquals("kritka",e.getName()));
	}



}
