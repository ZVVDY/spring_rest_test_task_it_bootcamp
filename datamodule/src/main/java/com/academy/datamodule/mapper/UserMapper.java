package com.academy.datamodule.mapper;

import com.academy.datamodule.dto.UserAllInformationDto;
import com.academy.datamodule.dto.UserDto;
import com.academy.datamodule.model.entity.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {

    UserDto toDto(User entity);

    User toEntity(UserDto usersDto);

    List<UserDto> modelsToDto(List<User> users);

    List<User> dtoToModels(List<UserDto> usersDto);

    default UserAllInformationDto toUserAllInformationDto(User user) {
        List<String> roleNames = user.getRoles().stream()
                .map(Enum::name)
                .collect(Collectors.toList());

        return UserAllInformationDto.builder()
                .surnameFirstNameMiddleName(user.getSurname() +
                        " " + user.getFirstName() + " " + user.getMiddleName())
                .email(user.getEmail())
                .roles(roleNames)
                .build();
    }

    List<UserAllInformationDto> dtoToEntityList(List<User> users);
}
