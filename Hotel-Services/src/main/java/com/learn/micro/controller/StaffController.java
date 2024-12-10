package com.learn.micro.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@GetMapping
	ResponseEntity<List<String>> getStaff(){
		List<String> list = Arrays.asList("Sunil","Alpesh","Mehul","Zaid","Vijay");
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
	}

}
