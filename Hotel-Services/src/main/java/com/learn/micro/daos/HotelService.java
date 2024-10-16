package com.learn.micro.daos;

import java.util.List;

import com.learn.micro.entities.Hotel;

public interface HotelService {

	// create hotel
	Hotel createHotel(Hotel hotel);

	// update hotel
	Hotel updateHotel(Hotel hotel);

	// delete hotel
	void deleteHotel(String hotelId);

	// get single hotel
	Hotel getSingleHotel(String hotelId);

	// get all hotel
	List<Hotel> getAllHotel();

}
