package com.dicedicebaby.dicedicebaby.controllers;

<<<<<<< HEAD

import com.dicedicebaby.dicedicebaby.models.Player;
import com.dicedicebaby.dicedicebaby.services.UserService;
=======
import com.dicedicebaby.dicedicebaby.services.PlayerService;
import com.dicedicebaby.dicedicebaby.models.Player;
import com.dicedicebaby.dicedicebaby.services.TableService;
>>>>>>> 355585f837b02038084ceaf6c3a3333713292f3c
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
=======

import java.util.List;
>>>>>>> 355585f837b02038084ceaf6c3a3333713292f3c

import java.util.List;
/*
@Controller
public class GameController {

<<<<<<< HEAD
  //@Autowired
 // UserService playerService;
  //TableService tableService;
  /*
=======
  @Autowired
  PlayerService playerService;
  TableService tableService;
>>>>>>> 355585f837b02038084ceaf6c3a3333713292f3c

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
