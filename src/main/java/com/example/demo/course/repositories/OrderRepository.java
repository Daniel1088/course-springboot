package com.example.demo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.course.entities.Order;
import com.example.demo.course.entities.User;


//Entidade e Id


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
