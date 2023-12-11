package com.infy.cab.api.CabBookingApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabService {
	
	@Autowired
	private CabRepo db;
	
	public String BookCab(Cab c) {
		 db.save(c);
		 return "Booking Confirmed";
	}
	
	public List <Cab> Getdetails() {
		return db.findAll();
		}
	
	public Optional<Cab> Getbyid(String phone) {
		Optional<Cab> cab = db.findById(phone);
		return cab;
	}
	
	public String cancel(String phone) {
	 db.deleteById(phone);
	 return "Booking Canceled";
	}
}
