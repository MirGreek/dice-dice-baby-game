package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Table;
import com.dicedicebaby.dicedicebaby.repositories.DieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DiceServiceImpl implements DiceService {

  private DieRepository dieRepository;

  @Autowired
  public DiceServiceImpl(DieRepository dieRepository) {
    this.dieRepository = dieRepository;
  }

  public Die reRoll(Die die) {
    die.setValue((int) (Math.random() * 6) + 1);
    return die;
  }


  public int rollNewDie() {
    Die die = new Die();
    die.setValue((int) (Math.random() * 6) + 1);
    return die.getValue();
  }

  @Override
  public List<Die> rollHand(){
    List<Die> hand = new ArrayList<>();
    Die die = new Die();
    die.setValue((int) (Math.random() * 6) + 1);
    Die die2 = new Die();
    die2.setValue((int) (Math.random() * 6) + 1);
    hand.add(die);
    hand.add(die2);
    Die die3 = new Die();
    die3.setValue((int) (Math.random() * 6) + 1);
    hand.add(die3);
    Die die4 = new Die();
    die4.setValue((int) (Math.random() * 6) + 1);
    hand.add(die4);
    Die die5 = new Die();
    die5.setValue((int) (Math.random() * 6) + 1);
    hand.add(die5);
    return hand;
  }

  /*public List<Die> rollTableDiceFirst() {
    Die die = new Die();
    Die die2 = new Die();
    Die die3 = new Die();
    List<Die> dice = new ArrayList<>();
    int value = rollNewDie();
    die.setValue(value);
    int value2 = rollNewDie();
    die2.setValue(value2);
    int value3 = rollNewDie();
    die3.setValue(value3);
    dice.add(die);
    dice.add(die2);
    dice.add(die3);
    return dice;
  }*/

@Override
  public HashMap diceCount(List<Die> myHand) { //should get only two lists of dice
    myHand = rollHand();
    HashMap<Integer, Integer> diceMap = new HashMap<>();

    for (int i = 0; i < myHand.size(); i++) {
      if (!diceMap.containsKey(myHand.get(i).getValue())) {
        diceMap.put(myHand.get(i).getValue(), 1);
      } else
        diceMap.put(myHand.get(i).getValue(), diceMap.get(myHand.get(i).getValue()) + 1);
    }
    return diceMap;
  }


  @Override
  public boolean fiveDiceSame(List<Die> myHand) {
     if (diceCount(myHand).containsValue(5)) {
       return true;
     }
     return false;
   }

  public boolean poker(List<Die> myHand) {
    if (diceCount(myHand).containsValue(4)) {
      return true;
    }
    return false;
  }

  public boolean threeDicesSame(List<Die> myHand) {
    if (diceCount(myHand).containsValue(3) && !diceCount(myHand).containsValue(3)) {
      return true;
    }
    return false;
  }

  public boolean fullhouseDicesSame(List<Die> myHand) {
    if (diceCount(myHand).containsValue(3) && diceCount(myHand).containsValue(3)) {
      return true;
    }
    return false;
  }

  public boolean pair(List<Die> myHand) {
    List<String> diceList = new ArrayList<>();
    diceList = diceCount(myHand).keySet();
    for (int i = 0; i <dice.length() ; i++) {

    }
    if (diceCount(myHand).containsKey(2) ) {
      return true;
    }
    return false;
  }





  @Override
  public int poker() {
    return 0;
  }

  @Override
  public int fullhouse() {
    return 0;
  }

  @Override
  public int straight() {
    return 0;
  }

  @Override
  public int tripple() {
    return 0;
  }

  @Override
  public int doublepairs() {
    return 0;
  }

  @Override
  public int pair() {
    return 0;
  }

  public List<Die> getCollection(){
    List<Die> myHand = rollHand();
    List<Die> tableDice = rollTableDiceFirst();
    List<Die> allDice = new ArrayList<>();
    allDice.add(myHand.get(0));
    allDice.add(myHand.get(1));
    allDice.add(tableDice.get(0));
    allDice.add(tableDice.get(1));
    allDice.add(tableDice.get(2));
    return allDice;
  }

}
