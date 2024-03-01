package com.colak.springjdbctemplatetutorial.repository;

import com.colak.springjdbctemplatetutorial.model.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findUsersByLastName(@Param("lastName") String lastName);

    // To avoid Method is only allowed for a query. Use execute or executeUpdate instead of executeQuery
    @Modifying
    @Query("UPDATE USERS u SET u.FIRST_NAME = :newName WHERE u.FIRST_NAME = :oldName")
    int updateFirstName(@Param("oldName") String oldName, @Param("newName") String newName);

}