package com.chinexboroja.secure_auth_system.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UserRequestDto {

    private String username;
    private String email;
}
