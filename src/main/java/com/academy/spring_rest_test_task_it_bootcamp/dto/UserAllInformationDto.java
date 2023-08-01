package com.academy.spring_rest_test_task_it_bootcamp.dto;

import com.academy.spring_rest_test_task_it_bootcamp.model.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserAllInformationDto {
    private String surnameFirstNameMiddleName;
    private String email;
    private List<Role> roles;
}
