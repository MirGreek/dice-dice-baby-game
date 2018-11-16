package com.dicedicebaby.dicedicebaby.services;

import org.springframework.stereotype.Service;

@Service
public interface PlayerService {

  void useSuperPowerRemoveCardFromList(Long currentUserId,String superpower);

  void useSuperPowerRollOtherPlayerDice(Long rolledUserId);

  void useSuperPowerRollMyDice(Long myId);
}
