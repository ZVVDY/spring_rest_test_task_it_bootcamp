package com.academy.spring_rest_test_task_it_bootcamp.controller;

//import com.academy.dto.PersonDto;
//import com.academy.service.PersonService;

import com.academy.spring_rest_test_task_it_bootcamp.dto.UserDto;
import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;
import com.academy.spring_rest_test_task_it_bootcamp.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;

    @GetMapping()
    public List<UserDto> findAll() {
        List<UserDto> users = userService.findAll();
        return users;
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity createUser(@Valid @RequestBody UserDto userDto) {
        userService.save(userDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity updateUser(@Valid @RequestBody UserDto userDto) {
        userService.update(userDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity createUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

//        @GetMapping()
//        public List<UserDto> findAllByEmail(@RequestParam(required = false) Sring sort) {
//            List<User> users = userService.findAll();
//            return users;
        // }
    }
}

