package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Player;
import com.dicedicebaby.dicedicebaby.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

  @Autowired
  PlayerRepository playerRepository;

  @Override
  public List<Player> getAllPlayers() {
    return playerRepository.findAll();
  }

  @Override
  public void createNewPlayer(Player player) {
    playerRepository.save(player);
  }
}
