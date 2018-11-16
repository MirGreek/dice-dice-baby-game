package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TableService {
  void useSuperPowerRollTableDices(Long tableId);
  void saveCurrentPlayersByIds(long[] idList);
  List<Die> rollTableDice();
  List<Player> getCurrentPlayers();
  List<Die> getDice();
}
