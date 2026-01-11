package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.service.OrderService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@PostMapping("/user/{userId}")
	public Order placeOrder(@PathVariable Long userId,  @RequestBody List<Long> productIds) {
		return orderService.placeOrder(userId, productIds);
	}
	
	@GetMapping("/user/{userId}")
	public List<Order> getOrderByUser(@PathVariable Long userId) {
		return orderService.getOrdersByUser(userId);
	}
	
}
