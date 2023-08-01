package com.academy.spring_rest_test_task_it_bootcamp.exeption;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("There is no user with this id= " + id);
    }

}
