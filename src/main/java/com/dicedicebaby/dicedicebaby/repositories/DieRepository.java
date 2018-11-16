package com.dicedicebaby.dicedicebaby.repositories;

import com.dicedicebaby.dicedicebaby.models.Die;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DieRepository extends CrudRepository<Die, Long> {

}
