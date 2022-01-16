package com.devsuperior.dsmovies.reposotories;

import com.devsuperior.dsmovies.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
