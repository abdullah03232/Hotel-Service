package com.learn.micro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.micro.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
