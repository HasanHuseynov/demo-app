package com.example.demoapp.mapper;

import com.example.demoapp.dto.request.UserRequest;
import com.example.demoapp.dto.response.UserResponse;
import com.example.demoapp.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-05T04:36:28-0700",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User fromDTO(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User user = new User();

        user.setName( userRequest.getName() );
        user.setSurname( userRequest.getSurname() );
        user.setEmail( userRequest.getEmail() );
        user.setPassword( userRequest.getPassword() );

        return user;
    }

    @Override
    public UserResponse toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setEmail( user.getEmail() );
        userResponse.setPassword( user.getPassword() );

        return userResponse;
    }

    @Override
    public List<UserResponse> toDTOs(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( users.size() );
        for ( User user : users ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public void mapUpdateRequestToEntity(User user, UserRequest userRequest) {
        if ( userRequest == null ) {
            return;
        }

        user.setName( userRequest.getName() );
        user.setSurname( userRequest.getSurname() );
        user.setEmail( userRequest.getEmail() );
        user.setPassword( userRequest.getPassword() );
    }
}
