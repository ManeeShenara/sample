package io.springboot.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> getAllOrders(String customerId){
		List<Order> orders = new ArrayList<> ();
		orderRepository.findByCustomerId(customerId)
		.forEach(orders::add);
		return orders;
	}
	
	public Optional<Order> getOrder(String oid) {
		return orderRepository.findById(oid);
	}

	public void addOrder(Order order) {
		orderRepository.save(order);	
	}

	public void updateOrder(Order order) {
		orderRepository.save(order);		
	}

	public void deleteOrder(String oid) {
		orderRepository.deleteById(oid);
		
	}
}
