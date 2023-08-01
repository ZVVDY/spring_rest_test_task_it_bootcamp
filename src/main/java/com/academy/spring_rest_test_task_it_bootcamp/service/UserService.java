package com.academy.spring_rest_test_task_it_bootcamp.service;


import com.academy.spring_rest_test_task_it_bootcamp.dto.UserDto;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;

import java.util.List;

public interface UserService {

    void save(UserDto userDto);
    void update(UserDto userDto);

List<UserDto> findAll();

    void deleteUser(Long id);

    boolean saveUser(User user);

}
