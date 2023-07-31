package com.academy.spring_rest_test_task_it_bootcamp.service.impl;

import com.academy.spring_rest_test_task_it_bootcamp.dto.UserDto;
import com.academy.spring_rest_test_task_it_bootcamp.mapper.UserMapper;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;
import com.academy.spring_rest_test_task_it_bootcamp.model.repository.UserRepository;
import com.academy.spring_rest_test_task_it_bootcamp.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
@Getter
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public void save(UserDto userDto) {
//        UserDto userToSave = new UserDto();
//        userToSave.setFirstName(user.getFirstName());
//        userToSave.setSurname(user.getSurname());
//        userToSave.setMiddleName(user.getMiddleName());
//        userToSave.setEmail(user.getEmail());
//        userToSave.setRoles(user.getRoles());
//        User result = userMapper.toEntity(userToSave);
      //  userRepository.save(result);
    }

    @Override
    public void update(UserDto userDto) {
//        UserDto userToUpdate = new UserDto();
//        userToUpdate.setId(user.getId());
//        userToUpdate.setFirstName(user.getFirstName());
//        userToUpdate.setSurname(user.getSurname());
//        userToUpdate.setMiddleName(user.getMiddleName());
//        userToUpdate.setEmail(user.getEmail());
//        userToUpdate.setRoles(user.getRoles());
//        User result = userMapper.toEntity(userToUpdate);
        //userRepository.save(result);
    }

    @Override
    public List<UserDto> findAll() {
        List<User> users = userRepository.findAll();
        List<UserDto> result = userMapper.modelsToDto(users);
        return result;
    }

    @Override
    public void deleteUser(Long id) {
        UserDto userToDelete = new UserDto();
        userToDelete.setId(id);
        Integer deleteId = (int) (long) userToDelete.getId();
        //User result = userMapper.toEntity(userToDelete);
        userRepository.deleteById(deleteId);
    }

    @Override
    public boolean saveUser(User user) {
        return false;
    }

}
