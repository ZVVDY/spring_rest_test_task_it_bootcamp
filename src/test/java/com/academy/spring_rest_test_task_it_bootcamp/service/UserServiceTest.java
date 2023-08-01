package com.academy.spring_rest_test_task_it_bootcamp.service;

import com.academy.spring_rest_test_task_it_bootcamp.dto.UserDto;
import com.academy.spring_rest_test_task_it_bootcamp.mapper.UserMapper;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.Role;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;
import com.academy.spring_rest_test_task_it_bootcamp.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import javax.management.relation.RoleList;
import java.util.Collections;
import java.util.List;

import static com.academy.spring_rest_test_task_it_bootcamp.model.entity.Role.ROLE_SALE_USER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    private final Integer ID = 9;
    @Mock
    UserRepository userRepository;
    @Mock
    UserMapper userMapper;

    private UserService userService;

    @Test
    public void repositorySavesUser() {
        UserDto user = new UserDto();
        user.setSurname("Ivanon");
        user.setFirstName("Fedor");
        user.setMiddleName("Sergeevich");
        user.setEmail("f.ivanov@gmail.com");
        //user.setRoles(Collections.singletonList(ROLE_SALE_USER));
        User result = userMapper.toEntity(user);
        userRepository.save(result);
        assertEquals(result.getSurname(), "Ivanon");
        assertEquals(result.getFirstName(), "Fedor");
        assertEquals(result.getMiddleName(), "Sergeevich");
        assertEquals(result.getEmail(), "f.ivanov@gmail.com");
        //assertEquals(result.getRoles(), Collections.singletonList(ROLE_SALE_USER));
    }
}