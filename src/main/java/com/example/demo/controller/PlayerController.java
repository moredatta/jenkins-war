package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Player;
import com.example.demo.serviceimpl.PlayerServiceImpl;

@RestController
@RequestMapping("player")
public class PlayerController {
	
	@Autowired
	
	PlayerServiceImpl playerImpl;
	
	
	
	@GetMapping("/getAll")
	public List<Player>getAllplayer(){
		return playerImpl.getAllplayer();
	}
	@PostMapping("/saveplayer")
	public Player savePlayer(@RequestBody Player p)
	{
		return playerImpl.saveplayer(p);
	}
	
	@PutMapping("/updateplayer/{id}")
	public Player updatePlayer(@PathVariable int id,@RequestBody Player p)
	{
		return playerImpl.updateplayer(id,p);
	}
	@DeleteMapping("/deleteplayer/{id}")
	public void deletePlayer(@PathVariable("id") int id)
	{
		playerImpl.deleteplayer(id);
	}
	
	}



