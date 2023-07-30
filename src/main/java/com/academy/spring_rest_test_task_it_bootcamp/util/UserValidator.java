package com.academy.spring_rest_test_task_it_bootcamp.util;


import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class UserValidator  {
//
//    private UserDetailsServiceImpl userDetailsService;

//    @Override
//    public boolean supports(Class<?> clazz) {
//        return User.class.isAssignableFrom(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        User user = (User) target;
//        if (StringUtils.isBlank(user.getFirstName()) || StringUtils.isBlank(user.getSurname())) {
//            errors.reject(null, "введите данные");
//        } else if (user.getFirstName() == null || user.getSurname() == null) {
//            errors.reject(null, "Необходимо указать имя пароль!");
//        }
//    }

//    @Autowired
//    public UserValidator(UserDetailsServiceImpl userDetailsService) {
//
//        this.userDetailsService = userDetailsService;
//    }
}

