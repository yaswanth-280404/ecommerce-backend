package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Order;


public interface OrderService {
	
	Order placeOrder(Long userId, List<Long> productIds);
	
	List<Order> getOrderByUser(Long userId);

}
