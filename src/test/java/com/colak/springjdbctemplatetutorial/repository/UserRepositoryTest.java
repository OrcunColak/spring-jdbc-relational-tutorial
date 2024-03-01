package com.colak.springjdbctemplatetutorial.repository;

import com.colak.springjdbctemplatetutorial.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFind() {
        Optional<User> optional = userRepository.findById(1L);
        assertTrue(optional.isPresent());
    }

    @Test
    void findUsersByLastName() {
        Iterable<User> iterable = userRepository.findUsersByLastName("Doe");
        List<User> userList = new ArrayList<>();
        iterable.forEach(userList::add);
        assertFalse(userList.isEmpty());
    }

    @Test
    void updateFirstName() {
        int rows = userRepository.updateFirstName("John", "John1");
        assertEquals(1, rows);
    }

}
