package com.academy.datamodule.dto;

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
    private List<String> roles;
}
