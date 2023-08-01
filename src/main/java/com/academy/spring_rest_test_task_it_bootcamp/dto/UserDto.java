package com.academy.spring_rest_test_task_it_bootcamp.dto;


import com.academy.spring_rest_test_task_it_bootcamp.model.entity.Role;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;
    @Valid
    @NotBlank(message = "The surname is required.")
    @Pattern(regexp = "^[a-zA-Z]{2,40}$", message = "Enter the correct surname")
    @Size(min = 2, max = 40, message = "Enter the correct number of characters 2-40")
    private String surname;
    @Valid
    @NotBlank(message = "The first name is required.")
    @Pattern(regexp = "^[a-zA-Z]{2,20}$", message = "Enter the correct first name")
    @Size(min = 2, max = 20, message = "Enter the correct number of characters 2-20")
    private String firstName;
    @Valid
    @NotBlank(message = "The middle name is required.")
    @Pattern(regexp = "^[a-zA-Z]{2,40}$", message = "Enter the correct middle name")
    @Size(min = 2, max = 40, message = "Enter the correct number of characters 2-40")
    private String middleName;
    @Email
    @Pattern(regexp = "^(?=.{1,20}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,}){0,50}$", message = "Enter the correct email")
    @Size(min = 3, max = 50, message = "Enter the correct number of characters 5-50")
    @NotEmpty(message = "The email is required.")
    private String email;
    private List<Role> roles;
}