package com.chinexboroja.secure_auth_system.service;

import com.chinexboroja.secure_auth_system.dto.UserRequestDto;
import com.chinexboroja.secure_auth_system.model.User;

public interface UserService {
    User createUser(UserRequestDto requestDto);
}
