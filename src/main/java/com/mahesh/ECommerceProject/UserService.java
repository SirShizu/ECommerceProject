package com.mahesh.ECommerceProject;

import org.springframework.stereotype.Service;

import com.mahesh.ECommerceProject.entity.User;
import com.mahesh.ECommerceProject.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
