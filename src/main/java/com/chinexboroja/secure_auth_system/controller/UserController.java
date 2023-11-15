package com.chinexboroja.secure_auth_system.controller;


import com.chinexboroja.secure_auth_system.dto.UserRequestDto;
import com.chinexboroja.secure_auth_system.model.User;
import com.chinexboroja.secure_auth_system.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody UserRequestDto requestDto) {
        return new ResponseEntity<>(userService.createUser(requestDto), HttpStatus.CREATED);
    }
}
