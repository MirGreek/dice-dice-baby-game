package com.dicedicebaby.dicedicebaby.controllers;

import com.dicedicebaby.dicedicebaby.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

  @Autowired
  PlayerService userService;

  @GetMapping("/")
  public String getMainPage() {

    return "index";
  }

}
