package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import com.dicedicebaby.dicedicebaby.models.Table;
import com.dicedicebaby.dicedicebaby.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TableServiceImpl implements TableService {

  private TableRepository tableRepository;

  @Autowired
  public TableServiceImpl(TableRepository tableRepository) {
    this.tableRepository = tableRepository;
  }

  @Override
  public void useSuperPowerRollTableDices(Long tableId) {
   Table table= tableRepository.findById(tableId).get();
    List<Die> newTableDices=rollTableDiceFirst();
    table.setDice(newTableDices);

  }
}
