package com.learn.micro.daosImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.micro.daos.HotelService;
import com.learn.micro.entities.Hotel;
import com.learn.micro.exception.ResourceNotFound;
import com.learn.micro.repositories.HotelRepository;

@Service
public class UserServiceImpl implements HotelService{

	@Autowired
	private HotelRepository repository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelId(hotelId);
		return repository.save(hotel);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		Hotel hotelDetails = repository.findById(hotel.getHotelId()).orElseThrow(() -> new ResourceNotFound());
		return repository.save(hotel);
	}

	@Override
	public void deleteHotel(String hotelId) {
		repository.deleteById(hotelId);
		
	}

	@Override
	public Hotel getSingleHotel(String hotelId) {
		return repository.findById(hotelId).orElseThrow(() -> new ResourceNotFound());
	}

	@Override
	public List<Hotel> getAllHotel() {
		return repository.findAll();
	}

}
