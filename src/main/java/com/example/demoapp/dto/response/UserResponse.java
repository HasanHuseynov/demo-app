package com.example.demoapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String email;
    private String password;
}
