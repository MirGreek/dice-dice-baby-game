package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Table;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface DiceService {

  public Die reRoll(Die die);

  public int rollOneDie(Die die);

  public List<Die> rollTableDiceFirst();

  public List<Die> rollHand();

  public HashMap diceCount(Die die, Table table);

  int fiveDicesSame();

  int poker();

  int fullhouse();

  int straight();

  int tripple();

  int doublepairs();

  int pair();
}