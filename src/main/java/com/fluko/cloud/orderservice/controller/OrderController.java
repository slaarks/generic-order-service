package com.fluko.cloud.orderservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fluko.cloud.orderservice.entity.OrderEntity;
import com.fluko.cloud.orderservice.repository.OrderRepository;

@RestController
@RequestMapping("/store")
public class OrderController {
	

	@Autowired
	OrderRepository orderRepository;

	//CREATE
	@PostMapping(path = "/order", consumes = "application/json", produces = "application/json")
	public OrderEntity create(@RequestBody OrderEntity orderEntity){
		orderRepository.save(orderEntity);
		return orderEntity;
	}
	
	//READ ALL
	@GetMapping("/orders")
	public List<OrderEntity> findAll(){
		List<OrderEntity> orders = orderRepository.findAll();
		return orders;
	}
	
	//READ ONE
	@GetMapping("/orders/{id}")
	public Optional<OrderEntity> findOne(@PathVariable long id){
		Optional<OrderEntity> orderEntity  = orderRepository.findById(id);
		return orderEntity;
	}
	
	//UPDATE
	@PutMapping(path = "/order", consumes = "application/json", produces = "application/json")
	public OrderEntity update(@RequestBody OrderEntity orderEntity){
		orderRepository.save(orderEntity);
		return orderEntity;
	}
	
	//DELETE
	@DeleteMapping(path = "/order", consumes = "application/json", produces = "application/json")
	public OrderEntity delte(@RequestBody OrderEntity orderEntity){
		orderRepository.delete(orderEntity);
		return orderEntity;
	}
}
