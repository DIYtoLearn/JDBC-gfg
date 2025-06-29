package com.hcl;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.hcl.beans.Employee;
import com.hcl.repo.EmployeeRepository;

//@DataJpaTest
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MockitoTestDataJpaApplicationTests {

	@Autowired
	private EmployeeRepository repo;
	
	@Order(1)
	@Test
	@Rollback(value=false)
	void saveEmployeeTest() 
	{
		Employee e = new Employee(2,"abc","xyz");
		repo.save(e);
		
		Assertions.assertThat(e.getEmpId()).isGreaterThan(0);
		
	}
	@Order(2)
	@Test
	@Rollback(value=false)
	void getEmployeebyId() 
	{
	
		 Optional<Employee> e=repo.findById(1);
		
		Assertions.assertThat(e.get().getEmpId()).isEqualTo(1);
		
	}
	

}
