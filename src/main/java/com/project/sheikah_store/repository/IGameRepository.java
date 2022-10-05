package com.project.sheikah_store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.sheikah_store.model.Game;

public interface IGameRepository extends JpaRepository<Game, Integer> {

    @Query("FROM Game")
    // @Query(value = "SELECT * FROM Game", nativeQuery = true)
    public List<Game> findAllGames();

}
