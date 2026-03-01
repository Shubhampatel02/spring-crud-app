package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.entity.*;
import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);
    List<User> getAllUsers();
    UserResponse getUserById(Long id);
    UserResponse getUserByEmail(String email);
    UserResponse updateUser(Long id, UserRequest user);
    void deleteUser(Long id);

	
}
