package com.example.nutriplanapi.mapper;


import com.example.nutriplanapi.dto.UserDTO;
import com.example.nutriplanapi.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {
    public User toUser(UserDTO userDTO) {
        User user = new User();
        user.setAge(userDTO.getAge());
        user.setGender(userDTO.getGender());
        user.setHeight(userDTO.getHeight());
        user.setWeight(userDTO.getWeight());
        user.setRestrictions(userDTO.getRestrictions());
        user.setHealthGoals(userDTO.getHealthGoals());
        return user;
    }

    public UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(user.getAge());
        userDTO.setGender(user.getGender());
        userDTO.setHeight(user.getHeight());
        userDTO.setWeight(user.getWeight());
        userDTO.setRestrictions(user.getRestrictions());
        userDTO.setHealthGoals(user.getHealthGoals());
        return userDTO;
    }
}
