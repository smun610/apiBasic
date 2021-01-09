package com.example.basic.api.apiBasic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.api.apiBasic.Entity.Players;

public interface PlayersRepository extends JpaRepository <Players,Integer> {
}
