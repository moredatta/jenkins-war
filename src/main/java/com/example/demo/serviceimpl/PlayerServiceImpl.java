package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlayerDao;
import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	PlayerDao dao;

	public List<Player> getAllplayer() {
		return dao.findAll();
	}

	public Player saveplayer(Player p) {
		return dao.save(p);
	}

	public Player updateplayer(int id,Player p) {
		return dao.save(p);
	}

	@Override
	public void deleteplayer(int id) {
		dao.deleteById(id);
		
	}
	
	

}
