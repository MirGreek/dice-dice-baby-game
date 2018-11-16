package com.dicedicebaby.dicedicebaby.repositories;

import com.dicedicebaby.dicedicebaby.models.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends CrudRepository<Table, Long> {

}
