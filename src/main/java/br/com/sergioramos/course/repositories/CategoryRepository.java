package br.com.sergioramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergioramos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
