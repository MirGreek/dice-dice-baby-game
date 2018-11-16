package com.dicedicebaby.dicedicebaby.services;

import org.springframework.stereotype.Service;
import com.dicedicebaby.dicedicebaby.models.Player;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PlayerService {

  void useSuperPowerRemoveCardFromList(Long currentUserId,String superpower);
  void useSuperPowerRollOtherPlayerDice(Long rolledUserId);
  void useSuperPowerRollMyDice(Long myId);
  List<Player> getAllPlayers();
  void createNewPlayer(Player player);
}
