package com.SpringBootLerning.SpringBoot;
import com.SpringBootLerning.SpringBoot.Question3.Employee;
import com.SpringBootLerning.SpringBoot.Question3.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       employeeRepository.save(new Employee(1L,"nitin","abc.com"));
       employeeRepository.save(new Employee(2L,"vijay","abc.com"));
       employeeRepository.save(new Employee(3L,"moksh","abc.com"));

	}
}
