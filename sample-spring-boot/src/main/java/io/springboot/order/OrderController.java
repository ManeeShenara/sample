package io.springboot.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.customer.Customer;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/customers/{id}/orders")
	public List<Order> getAllOrders(@PathVariable String id) {
		return orderService.getAllOrders(id);			
	}
	
	@RequestMapping("/customers/{customerId}/orders/{oid}")
	public Optional<Order> getOrder(@PathVariable String oid) {
		return orderService.getOrder(oid);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers/{customerId}/orders")
	public void addOrder(@RequestBody Order order,@PathVariable String customerId) {
		//order.setCustomer(new Customer(customerId, "", ""));
		orderService.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{customerId}/orders/{oid}")
	public void updateOrder(@RequestBody Order order,@PathVariable String oid,@PathVariable String customerId) {
		//order.setCustomer(new Customer(customerId, "", ""));
		orderService.updateOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{customerId}/orders/{oid}")
	public void deleteOrder(@PathVariable String oid) {
		orderService.deleteOrder(oid);
	}
}
