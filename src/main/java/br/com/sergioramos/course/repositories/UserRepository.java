package br.com.sergioramos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sergioramos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
