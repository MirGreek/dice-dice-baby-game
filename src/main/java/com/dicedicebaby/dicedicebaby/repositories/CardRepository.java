package com.dicedicebaby.dicedicebaby.repositories;

import com.dicedicebaby.dicedicebaby.models.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {

}
