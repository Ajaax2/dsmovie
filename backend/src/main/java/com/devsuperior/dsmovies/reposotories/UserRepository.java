package com.devsuperior.dsmovies.reposotories;

import com.devsuperior.dsmovies.entities.Movie;
import com.devsuperior.dsmovies.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

User findByEmail(String email);


}
