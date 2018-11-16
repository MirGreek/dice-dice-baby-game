package com.dicedicebaby.dicedicebaby.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

  @GetMapping("/")
  public String getMainPage() {
    return "index";
  }

}
