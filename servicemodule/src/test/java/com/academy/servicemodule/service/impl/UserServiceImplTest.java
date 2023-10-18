package com.academy.servicemodule.service.impl;

import com.academy.datamodule.dto.UserAllInformationDto;
import com.academy.datamodule.mapper.UserMapper;
import com.academy.datamodule.model.entity.User;
import com.academy.datamodule.model.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    private final Integer ID = 9;
    @Mock
    private UserRepository userRepository;
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserServiceImpl userService;

@Test
    public void shouldReturnAListOfUserSortedByEmail() {

    //Mockito.when(userRepository.findAll();





    }

    private Page<UserAllInformationDto> findAll(Integer page) {
        Pageable firstPageWithTenElements = PageRequest.of(page - 1, 10, Sort.by("email")
                .ascending());
        Page<User> pageUser = userRepository.findAll(firstPageWithTenElements);
        return pageUser.map(userMapper::toUserAllInformationDto);
    }



   // @Test
//    public void repositorySavesUser() {
//        UserDto user = new UserDto();
//        user.setSurname("Ivanon");
//        user.setFirstName("Fedor");
//        user.setMiddleName("Sergeevich");
//        user.setEmail("f.ivanov@gmail.com");
//        //user.setRoles(Collections.singletonList(ROLE_SALE_USER));
//        User result = userMapper.toEntity(user);
//        userRepository.save(result);
//        assertEquals(result.getSurname(), "Ivanon");
//        assertEquals(result.getFirstName(), "Fedor");
//        assertEquals(result.getMiddleName(), "Sergeevich");
//        assertEquals(result.getEmail(), "f.ivanov@gmail.com");
//        //assertEquals(result.getRoles(), Collections.singletonList(ROLE_SALE_USER));
    //}
}