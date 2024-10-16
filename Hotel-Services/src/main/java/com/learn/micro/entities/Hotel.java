package com.learn.micro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "hotels")
public class Hotel {
	
	@Id
	private String hotelId;
	private String hotelName;
	private String hotelLocation;
	private String hotelAbout;
	

}
