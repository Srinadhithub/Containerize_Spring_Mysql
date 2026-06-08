package com.example.containerize.firsttddtest;

import com.example.containerize.entities.Users;
import com.example.containerize.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class FirstTest {

    @Autowired
    UserRepo userRepo;

    @Test
    public void testNumbersEqual(){
        assertEquals(6/2.5,3);
    }

    @Test
    public  void testUserSaving(){
        Users user = new Users();
        user.setUserName("Srinadh");
        Users user1= userRepo.save(user);
        assertNotNull(user1);
        assertEquals(user1.getUserName(),user.getUserName());
    }
}
