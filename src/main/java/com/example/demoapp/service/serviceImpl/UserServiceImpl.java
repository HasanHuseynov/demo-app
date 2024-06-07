package com.example.demoapp.service.serviceImpl;

import com.example.demoapp.dto.request.UserRequest;
import com.example.demoapp.dto.response.UserResponse;
import com.example.demoapp.entity.User;
import com.example.demoapp.mapper.UserMapper;
import com.example.demoapp.repository.UserRepository;
import com.example.demoapp.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final UserMapper userMapper;


    @Override
    public List<UserResponse> getAllUser() {
        List<User> userEntities = userRepository.findAll();
        return userMapper.toDTOs(userEntities);
    }

    @Override
    public UserResponse createNewUser(UserRequest userRequest) {
        User userEntity = userMapper.fromDTO(userRequest);
        userEntity = userRepository.save(userEntity);
        return userMapper.toDTO(userEntity);
    }

    @Override
    public void deleteById(Integer id) {
        User userEntity = userRepository.findById(id).orElseThrow(() -> {
            return new RuntimeException("User not found with id: " + id);
        });
        userRepository.delete(userEntity);
    }

    @Override
    public void updateUser(Integer id, UserRequest userRequest) {
        var userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        userMapper.mapUpdateRequestToEntity(userEntity, userRequest);
        userRepository.save(userEntity);
    }
}
