package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;

public class DieRolls extends Die {
  int[] dieRoll=new int[5];

  public void inHand(){
    dieRoll[0]=((int) Math.random()*6)+1;
    dieRoll[1]=((int) Math.random()*6)+1;
  }
}
