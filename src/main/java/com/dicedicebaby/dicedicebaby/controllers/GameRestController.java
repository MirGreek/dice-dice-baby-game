package com.dicedicebaby.dicedicebaby.controllers;

import com.dicedicebaby.dicedicebaby.models.Player;
import com.dicedicebaby.dicedicebaby.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameRestController {
@Autowired
PlayerRepository playerRepository;

  @GetMapping("/games")
  public List<Player> getJsonForTrial(){
    return playerRepository.findAll();

  }
}
