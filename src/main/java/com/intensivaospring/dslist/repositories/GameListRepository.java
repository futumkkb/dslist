package com.intensivaospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivaospring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
