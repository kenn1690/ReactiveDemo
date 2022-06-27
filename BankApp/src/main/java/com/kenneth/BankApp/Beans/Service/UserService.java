package com.kenneth.BankApp.Beans.Service;

import com.kenneth.BankApp.Beans.Repositories.UserRepository;
import com.kenneth.BankApp.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {
    Random randy = new Random();
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User registerNewUser(User user){
        long randomAccountNumber = (randy.nextLong() % 100000000000000L) + 5200000000000000L;
        System.out.println("hello world" + randomAccountNumber);
        while(userRepository.accountNumberExists(randomAccountNumber) != null){
            randomAccountNumber = (randy.nextLong() % 100000000000000L) + 5200000000000000L;
        }
        user.setAccountNumber(randomAccountNumber);
        return userRepository.save(user);
    }

}
