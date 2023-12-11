package com.example.junittest;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Employee {
	
	@Id
	private Long id;
	public Long getId() {
		return id;
	}
	public Employee(Long id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public Employee() {
		
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	private String name;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Employee employee = (Employee) obj;
	        return Objects.equals(id, employee.id) &&
	               Objects.equals(name, employee.name) &&
	               Objects.equals(dept, employee.dept);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name, dept);
	    }

}
