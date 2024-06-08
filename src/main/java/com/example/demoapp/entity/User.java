package com.example.demoapp.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;


import java.time.LocalDateTime;


@Slf4j
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "User", schema = "user_ms")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private boolean enabled = false;

    @Column(name  = "confirm_password")
    private String confirmPassword;

    @Column(name = "otp")
    private String otp;

    @Column(name = "otp_expiration")
    private LocalDateTime otpExpiration;

}
