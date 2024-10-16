package com.learn.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.micro.daos.HotelService;
import com.learn.micro.entities.Hotel;

@Controller
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService service;

	@PostMapping
	ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createHotel(hotel));
	}
	
	@PutMapping
	ResponseEntity<Hotel> uupdateHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.updateHotel(hotel));
	}
	
	@DeleteMapping("/{hotelId}")
	ResponseEntity<String> deleteHotel(@PathVariable String hotelId){
		service.deleteHotel(hotelId);
		return new ResponseEntity<String>("User has been deleted successfully",HttpStatus.OK);
	}
	
	@GetMapping("/{hotelId}")
	ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(service.getSingleHotel(hotelId));
	}
	
	@GetMapping
	ResponseEntity<List<Hotel>> getAllHotels(){
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllHotel());
	}
	
}
