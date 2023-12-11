package com.example.crudoperation.crudoperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepo db;

    @Autowired
    public StudentService (StudentRepo db) {
        this.db = db;
    }

    public List<Student> getAllUsers() {
        return db.findAll();
    }

    public Optional<Student> getUserById(Long id) {
        return db.findById(id);
    }

    public Student createUser(Student user) {
        return db.save(user);
    }

    public Student updateUser(Long id, Student updatedUser) {
        Student s = db.findById(id).orElseThrow();
        s.setName(updatedUser.getName());
        s.setEmail(updatedUser.getEmail());
        return db.save(s); 
    }

    public void deleteUser(Long id) {
    	db.deleteById(id);
    }
	
}
