package com.devsuperior.dsmovies.reposotories;

import com.devsuperior.dsmovies.entities.Score;
import com.devsuperior.dsmovies.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {



}
