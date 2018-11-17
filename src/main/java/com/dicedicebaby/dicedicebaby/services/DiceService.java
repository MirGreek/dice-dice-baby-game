package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Table;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface DiceService {

  public Die reRoll(Die die);

  public List<Die> rollTableDiceFirst();

  public List<Die> rollHand();

  public boolean fiveDicesSame(List<Die> myHand,List<Die> tableDice);
  public HashMap diceCount(List<Die> myHand, List<Die> tableDice);


  int poker();

  int fullhouse();

  int straight();

  int tripple();

  int doublepairs();

  int pair();
}