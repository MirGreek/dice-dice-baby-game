package com.dicedicebaby.dicedicebaby.repositories;

import com.dicedicebaby.dicedicebaby.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
