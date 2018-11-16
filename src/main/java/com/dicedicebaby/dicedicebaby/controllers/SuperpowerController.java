package com.dicedicebaby.dicedicebaby.controllers;

import com.dicedicebaby.dicedicebaby.services.PlayerService;
import com.dicedicebaby.dicedicebaby.services.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class SuperpowerController {

  @Autowired
  PlayerService playerService;
  TableService tableService;

  @GetMapping("{id}/rollOtherPlayerDice")
  public void rollOtherPlayerDice(@PathVariable(name = "id") Long currentUserId) {
    playerService.useSuperPowerRemoveCardFromList(currentUserId, "rollOtherPlayerDice");

//    return "pop up form for selecting person"
  }

  @GetMapping("rollOtherPlayerDices/{id}")
  public String rollOtherPlayerDices(@PathVariable(name = "id") Long rolledUserId) {
    playerService.useSuperPowerRollOtherPlayerDice(rolledUserId);
    return "game";
//    return "pop up form for selecting person"
  }

  @GetMapping("rollTableDice/{id}")
  public String rollTableDices(@PathVariable(name = "id") Long tableId) {
    tableService.useSuperPowerRollTableDices(tableId);
    return "game";
//    return "pop up form for selecting person"
  }

  @GetMapping("rollMyDices/{id}")
  public String rollMyDices(@PathVariable(name = "id") Long myId) {
    playerService.useSuperPowerRollMyDice(myId);
    return "game";

  }
}
