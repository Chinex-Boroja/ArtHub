package com.chinexboroja.secure_auth_system.service;

import com.chinexboroja.secure_auth_system.dto.UserRequestDto;
import com.chinexboroja.secure_auth_system.model.User;
import com.chinexboroja.secure_auth_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;
    @Override
    public User createUser(UserRequestDto requestDto) {
        User user = new User();
        user.setUsername(requestDto.getUsername());
        user.setEmail(requestDto.getEmail());
        return userRepository.save(user);
    }
}
