package com.academy.servicemodule.exeption;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("There is no user with this id= " + id);
        log.error("There is no user with this id= " + id);
    }

}
