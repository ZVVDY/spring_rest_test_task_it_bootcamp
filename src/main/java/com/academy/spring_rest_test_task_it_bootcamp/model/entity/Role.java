package com.academy.spring_rest_test_task_it_bootcamp.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public enum Role {
    ROLE_ADMINISTRATOR, ROLE_SALE_USER, ROLE_CUSTOMER_USER, ROLE_SECURE_API_USER
}

