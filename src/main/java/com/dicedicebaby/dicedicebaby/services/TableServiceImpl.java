package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Player;
import com.dicedicebaby.dicedicebaby.models.Table;
import com.dicedicebaby.dicedicebaby.repositories.PlayerRepository;
import com.dicedicebaby.dicedicebaby.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TableServiceImpl implements TableService {

  @Autowired
  TableRepository tableRepository;

  @Autowired
  PlayerRepository playerRepository;

  @Override
  public void saveCurrentPlayersByIds(long[] idList) {
    Table table = new Table();
    table.setId(1L);
    List<Player> currentPlayers = new ArrayList<>();
    for (int i = 0; i < idList.length; i++) {
      Player player = playerRepository.findById(idList[i]).orElse(null);
      currentPlayers.add(player);
    }
    table.setPlayers(currentPlayers);
    tableRepository.save(table);
  }

  @Override
  public List<Player> getCurrentPlayers() {
    Table table = tableRepository.findById(1L).orElse(null);
    return table.getPlayers();
  }
}
