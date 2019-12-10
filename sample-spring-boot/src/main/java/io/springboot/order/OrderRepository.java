package io.springboot.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {

	public Iterable<Order> findByCustomerId(String customerId);
}
