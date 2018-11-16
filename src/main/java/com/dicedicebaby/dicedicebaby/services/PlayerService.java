package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {

  List<Player> getAllPlayers();
  void createNewPlayer(Player player);
}
