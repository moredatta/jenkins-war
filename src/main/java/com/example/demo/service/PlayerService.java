package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Player;

public interface PlayerService {
		
		public List<Player>getAllplayer();
		
		public Player saveplayer(Player s);
		public Player updateplayer(int id,Player s);
        public void deleteplayer(int id);
	}

