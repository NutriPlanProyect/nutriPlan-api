package com.example.nutriplanapi.controller;

import com.example.nutriplanapi.model.User;
import com.example.nutriplanapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.nutriplanapi.dto.UserDTO;
import com.example.nutriplanapi.exception.InvalidUserRequestException;
import com.example.nutriplanapi.mapper.UserDTOMapper;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private final UserService userService;
    private  final UserDTOMapper userDTOMapper;
    public UserController(UserService userService, UserDTOMapper userDTOMapper) {
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }
    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) throws InvalidUserRequestException {
        if (userDTO == null) {
            throw new InvalidUserRequestException("Data de usuario invalido");
        }

        User user = userDTOMapper.toUser(userDTO);
        User createdUser = userService.createUser(user);
        UserDTO createdUserDTO = userDTOMapper.toUserDTO(createdUser);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
