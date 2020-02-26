package br.com.sergioramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergioramos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
