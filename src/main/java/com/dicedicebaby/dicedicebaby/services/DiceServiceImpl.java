package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Table;
import com.dicedicebaby.dicedicebaby.repositories.DieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DiceServiceImpl implements DiceService {

  @Autowired
  private DieRepository dieRepository;

  public Die reRoll(Die die) {
    die.setValue((int) (Math.random() * 6) + 1);
    //dieRepository.save(die);
    return die;
  }

  public List<Die> rollHand() {
    List<Die> dice = new ArrayList<>();
    Die die = new Die();
    Die die2 = new Die();
    die.setValue((int) (Math.random() * 6) + 1);
    die2.setValue((int) (Math.random() * 6) + 1);
    dice.add(die);
    dice.add(die2);
    //dieRepository.save(die);
    return dice;
  }


  @Override
  public boolean allDicesAreSame(List<Die> dice, Table table) {
    List<Die> tableDice = table.getDice();
    for (int i = 0; i <dice.size() ; i++) {
      for (int j = 0; j <tableDice.size(); j++) {
        if (tableDice.get(j)==dice.get(i)){
          
        }
      }

    }
    return false;
  }

  @Override
  public int fiveDicesSame() {
    return 0;
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

}
