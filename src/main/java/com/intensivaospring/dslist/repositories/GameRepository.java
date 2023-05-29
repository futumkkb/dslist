package com.intensivaospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivaospring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
