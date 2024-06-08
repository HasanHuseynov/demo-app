package com.example.demoapp.dto.response;

import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
}
