package com.academy.spring_rest_test_task_it_bootcamp.mapper;

import com.academy.spring_rest_test_task_it_bootcamp.dto.UserAllInformationDto;
import com.academy.spring_rest_test_task_it_bootcamp.dto.UserDto;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {

    UserDto toDto(User entity);

    User toEntity(UserDto usersDto);

    List<UserDto> modelsToDto(List<User> users);

    List<User> dtoToModels(List<UserDto> usersDto);

    default UserAllInformationDto toUserAllInformationDto(User user) {
        return new UserAllInformationDto().builder()
                .surnameFirstNameMiddleName(user.getSurname() +
                        " " + user.getFirstName() + " " + user.getMiddleName())
                .email(user.getEmail())
                .roles(user.getRoles())
                .build();
    }

    List<UserAllInformationDto> dtoToEntityList(List<User> users);
}
