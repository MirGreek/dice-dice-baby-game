package com.dicedicebaby.dicedicebaby.controllers;


import com.dicedicebaby.dicedicebaby.models.Player;
import com.dicedicebaby.dicedicebaby.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/*
@Controller
public class GameController {

  //@Autowired
 // UserService playerService;
  //TableService tableService;
  /*

  @GetMapping("/")
  public String getMainPage(Model model) {
    model.addAttribute("newPlayer", new Player());
    model.addAttribute("players", playerService.getAllPlayers());
    return "index";
  }

  @PostMapping("/addnewplayer")
  public String addNewPlayer(@ModelAttribute Player player) {
    playerService.createNewPlayer(player);
    return "redirect:/";
  }

  @PostMapping("/game")
  public String getGamePlayers(@RequestParam Long players) {
    System.out.println(players);
//    tableService.saveCurrentPlayersByIds(faszod);
//    tableService.rollTableDice();
    return "redirect:/game";
  }

  @GetMapping("/game")
  public String showGame(Model model) {
    model.addAttribute("tabledice", tableService.getDice());
    model.addAttribute("players", tableService.getCurrentPlayers());
    return "game";
  }

}
*/
