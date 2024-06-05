package com.example.demoapp.service;

import com.example.demoapp.dto.request.UserRequest;
import com.example.demoapp.dto.response.UserResponse;


import java.util.List;

public interface UserService {
    List<UserResponse> getAllUser();

    UserResponse createNewUser(UserRequest userRequest);

    void updateUser(Integer id, UserRequest userRequest);

    void deleteById(Integer id);


}
