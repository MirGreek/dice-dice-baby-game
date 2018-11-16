package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  PlayerRepository playerRepository;

}
