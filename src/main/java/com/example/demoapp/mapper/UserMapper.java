package com.example.demoapp.mapper;

import com.example.demoapp.dto.request.UserRequest;
import com.example.demoapp.dto.response.UserResponse;
import com.example.demoapp.entity.User;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper(
        builder = @Builder(disableBuilder = true)
)
public interface UserMapper {
    User fromDTO(UserRequest userRequest);

    UserResponse toDTO(User user);

    List<UserResponse> toDTOs(List<User> users);

    void mapUpdateRequestToEntity(@MappingTarget User user, UserRequest userRequest);


}
