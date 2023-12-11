package com.infy.cab.api.CabBookingApi;



import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(collection="bookings")
@NoArgsConstructor
@AllArgsConstructor
public class Cab {

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPickup() {
		return pickup;
	}
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	public String getDrop() {
		return drop;
	}
	public void setDrop(String drop) {
		this.drop = drop;
	}
	public String getCabtype() {
		return cabtype;
	}
	public void setCabtype(String cabtype) {
		this.cabtype = cabtype;
	}

	@Id
	private String phone;
	private String pickup;
	private String drop;
	private String cabtype;
}
