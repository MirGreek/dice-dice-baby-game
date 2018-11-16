package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiceService {

  public Die reRoll(Die die);

  public List<Die> rollHand();

  boolean allDicesAreSame(List<Die> dice, Table table);

  int ifAlldiceAreSameWhoHasBigger(List<Die> handOne,List<Die> handTwo);

  int fiveDicesSame();

  int poker();

  int fullhouse();

  int straight();

  int tripple();

  int doublepairs();

  int pair();
}