package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.repositories.DieRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DiceServiceImpl implements DiceService {

  @Autowired
  private DieRepository dieRepository;

  public Die roll(Die die){
    die.setValue((int) (Math.random()*6)+1);
    return die;
  }
}
