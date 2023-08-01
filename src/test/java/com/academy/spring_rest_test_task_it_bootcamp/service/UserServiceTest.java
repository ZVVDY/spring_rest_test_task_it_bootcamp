package com.academy.spring_rest_test_task_it_bootcamp.service;

import com.academy.spring_rest_test_task_it_bootcamp.mapper.UserMapper;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.Role;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;
import com.academy.spring_rest_test_task_it_bootcamp.model.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import javax.management.relation.RoleList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    private Integer ID = 9;
    @Autowired
    private UserRepository userRepository;
    @Mock
    private UserMapper userMapper;

    //@Test
    public void repositorySavesUser() {
        User user = new User();
        user.setSurname("Ivanon");
        user.setFirstName("Fedor");
        user.setMiddleName("Sergeevich");
        user.setEmail("f.ivanov@gmail.com");
        user.setRoles(Collections.singletonList(Role.ROLE_SALE_USER));
        User result = userRepository.save(user);
        assertEquals(result.getSurname(), "Ivanon");
        assertEquals(result.getFirstName(), "Fedor");
        assertEquals(result.getMiddleName(), "Sergeevich");
        assertEquals(result.getEmail(), "f.ivanov@gmail.com");
        assertEquals(result.getRoles(), Collections.singletonList(Role.ROLE_SALE_USER));
    }
}