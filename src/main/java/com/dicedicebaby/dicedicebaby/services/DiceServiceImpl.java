package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.repositories.DieRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DiceServiceImpl implements DiceService {

  private DieRepository dieRepository;

  @Autowired
  public DiceServiceImpl(DieRepository dieRepository) {
    this.dieRepository = dieRepository;
  }

  public Die roll(Die die){
    die.setValue((int) (Math.random()*6)+1);
    return die;
  }
}
