package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Card;
import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Player;
import com.dicedicebaby.dicedicebaby.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

  @Autowired
  PlayerRepository playerRepository;

  @Override
  public void useSuperPowerRemoveCardFromList(Long currentUserId, String superPower) {
    Player player = playerRepository.findById(currentUserId).get();
    List<Card> listOfSuperPowers = player.getCards();
    for (Card c : listOfSuperPowers) {
      if (c.getName().equals(superPower)) {
        listOfSuperPowers.remove(c);
      }
    }
  }

  @Override
  public void useSuperPowerRollOtherPlayerDice(Long rolledUserId) {
    Player player = playerRepository.findById(rolledUserId).get();
    player.setNumberOfRolls(0);
  }

  @Override
  public void useSuperPowerRollMyDice(Long myId) {
    Player player = playerRepository.findById(myId).get();
    List<Die> listOfdie=rollplayerDice();
    player.setDice(listOfdie);
  }

  private List<Die> rollplayerDice() {
    List<Die> listOfDice=new ArrayList<>();
    Die die=new Die();
    for (int x=0;x<2;x++){
      int random=(int)(Math.random()*6)+1;
      die.setValue(random);
      listOfDice.add(die);
    }
    return listOfDice;
  }

  @Override
  public List<Player> getAllPlayers() {
    return playerRepository.findAll();
  }

  @Override
  public void createNewPlayer(Player player) {
    playerRepository.save(player);
  }
}
