package com.academy.servicemodule.service;


import com.academy.datamodule.dto.UserAllInformationDto;
import com.academy.datamodule.dto.UserDto;
import org.springframework.data.domain.Page;

public interface UserService {

    void save(UserDto userDto);

    void update(Integer id, UserDto userDto);

    Page<UserAllInformationDto> findAll(Integer page);

    void deleteUser(Long id);

    UserDto findById(Long id);
}
