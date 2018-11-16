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
public class Table {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @OneToMany
  List<Die> dice;
  @OneToMany
  List<Player> players;

}
