package service;

import java.util.List;
//import java.util.Set;

import model.Order;


public interface OrderService {

	
	public Order createOrder(Order order);
	public List<Order> getAllOrder();
	
}
