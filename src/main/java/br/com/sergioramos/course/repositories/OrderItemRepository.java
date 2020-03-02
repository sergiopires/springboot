package br.com.sergioramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergioramos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
