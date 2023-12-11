package com.example.junittest;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunittestApplicationTests {
	
	@Autowired
	private EmpRepo db;
	
	@Test
	public void saveTest() {
		Employee emp = new Employee();
	    emp.setId(4L);
	    emp.setName("prasad");
	    emp.setDept("cs");
	    db.save(emp);

	    Employee savedEmp = db.findById(2L).orElse(null);
        assertThat(savedEmp).isNotNull();
 
	}
	
	
	 @Test
	    public void updateTest() {
		 Employee emp = new Employee();
	        emp.setId(8L);
	        emp.setName("manju");
	        emp.setDept("cp");
	        db.save(emp);

	        
	        Employee savedEmployee = db.findById(8L).orElse(null);
	        assertThat(savedEmployee).isNotNull();

	        // Update the employee's information
	        savedEmployee.setName("ashok");
	        savedEmployee.setDept("auto");
	        db.save(savedEmployee);

	
	        Employee updatedEmployee = db.findById(8L).orElse(null);


	        assertThat(updatedEmployee).isNotNull();
	        assertThat(updatedEmployee.getName()).isEqualTo("ashok");
	        assertThat(updatedEmployee.getDept()).isEqualTo("auto");
	    }
	
	 
	 @Test
	    public void deleteTest() {
		 Employee emp = new Employee();
	        emp.setId(2L);
	        emp.setName("anil");
	        emp.setDept("mech");
	        db.save(emp);
	        Employee savedEmployee = db.findById(2L).orElse(null);


	        assertThat(savedEmployee).isNotNull();
	        db.deleteById(2L);


	        Employee deletedEmployee = db.findById(2L).orElse(null);
	        assertThat(deletedEmployee).isNull();
	    }

}
