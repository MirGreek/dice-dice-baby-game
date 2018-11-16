package com.dicedicebaby.dicedicebaby.services;

import com.dicedicebaby.dicedicebaby.models.Die;
import org.springframework.stereotype.Service;

@Service
public interface DiceService {

  Die roll(Die die);
}
