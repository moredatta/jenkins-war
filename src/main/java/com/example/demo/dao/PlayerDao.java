package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Player;

@Repository
	
	public interface PlayerDao extends JpaRepository<Player, Integer> 
	{
		
	}


