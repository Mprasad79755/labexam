package com.infy.cab.api.CabBookingApi;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CabRepo extends MongoRepository<Cab , String >{

}
