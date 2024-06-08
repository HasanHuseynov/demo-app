package com.example.demoapp.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
public class UserRequest{
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Password must contain at least one uppercase letter, one lowercase letter, one number, one special character, and be at least eight characters long")
    private String password;

}
