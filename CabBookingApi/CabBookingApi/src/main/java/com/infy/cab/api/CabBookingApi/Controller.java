package com.infy.cab.api.CabBookingApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	private CabService db;
	
	@PostMapping
	public String book(@RequestBody Cab c) {
		return db.BookCab(c);
	}
	
	@GetMapping
	public List <Cab> getall(){
		return db.Getdetails();
	}
	
	@GetMapping("/{phone}")
	public Optional<Cab> getById(@PathVariable String phone) {
	    return db.Getbyid(phone);
	}

	@DeleteMapping("/cancel/{phone}")
	public String cancel(@PathVariable String phone) {
	    return db.cancel(phone);
	}
}
