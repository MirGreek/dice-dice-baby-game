package com.dicedicebaby.dicedicebaby.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String name;
  int drinks;
  int numberOfRolls = 2;
  @OneToMany
  List<Die> dice;
  @OneToMany
  List<Card> cards;

}
