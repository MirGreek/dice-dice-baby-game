package com.dicedicebaby.dicedicebaby.controllers;

import com.dicedicebaby.dicedicebaby.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

  @Autowired
  UserService userService;

  @GetMapping("/")
  public String getMainPage() {

    return "index";
  }

}
