package com.academy.spring_rest_test_task_it_bootcamp.service;


import com.academy.spring_rest_test_task_it_bootcamp.dto.UserAllInformationDto;
import com.academy.spring_rest_test_task_it_bootcamp.dto.UserDto;
import org.springframework.data.domain.Page;

public interface UserService {

    void save(UserDto userDto);

    void update(Integer id, UserDto userDto);

    Page<UserAllInformationDto> findAll(Integer page);

    void deleteUser(Long id);

    UserDto findById(Long id);
}
