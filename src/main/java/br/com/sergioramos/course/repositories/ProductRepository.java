package br.com.sergioramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergioramos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
