package com.academy.servicemodule.service.impl;

import com.academy.datamodule.dto.UserAllInformationDto;
import com.academy.datamodule.dto.UserDto;
import com.academy.datamodule.model.entity.Role;
import com.academy.servicemodule.exeption.UserNotFoundException;
import com.academy.datamodule.mapper.UserMapper;
import com.academy.datamodule.model.entity.User;
import com.academy.datamodule.model.repository.UserRepository;
import com.academy.servicemodule.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
@Service
@Setter
@Getter
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public void save(UserDto userDto) {
        User userToSave = userMapper.toEntity(userDto);
        userRepository.save(userToSave);
        log.info("User save to DB");
    }

    @Override
    public void update(Integer id, UserDto userDto) {
        User updateUser = new User();
        updateUser.setId(userDto.getId());
        updateUser.setFirstName(userDto.getFirstName());
        updateUser.setMiddleName(userDto.getMiddleName());
        updateUser.setEmail(userDto.getEmail());
        updateUser.setRoles(userDto.getRoles()
                .stream()
                .map(Role::valueOf)
                .collect(Collectors.toList()));
        userRepository.save(updateUser);
    }

    @Override
    public Page<UserAllInformationDto> findAll(Integer page) {
        Pageable firstPageWithTenElements = PageRequest.of(page - 1, 10, Sort.by("email")
                .ascending());
        Page<User> pageUser = userRepository.findAll(firstPageWithTenElements);
        return pageUser.map(userMapper::toUserAllInformationDto);
    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> userDelete = userRepository.findById(id);
        if (userDelete.isPresent()) {
            userRepository.deleteById(id);
        } else {
            throw new UserNotFoundException(id);
        }
    }

    @Override
    public UserDto findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return userMapper.toDto(user.get());
        } else {
            throw new UserNotFoundException(id);
        }
    }
}

