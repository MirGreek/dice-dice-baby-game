package com.dicedicebaby.dicedicebaby.controllers;

import com.dicedicebaby.dicedicebaby.models.PlayerArray;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

  @PostMapping("api/game")
  public String gamememgmmfmfmfmf(@ModelAttribute PlayerArray playerArray){
    return "redirect:/";
  }
}
