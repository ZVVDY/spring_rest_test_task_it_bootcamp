package com.academy.datamodule.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public enum Role {
    ROLE_ADMINISTRATOR, ROLE_SALE_USER, ROLE_CUSTOMER_USER, ROLE_SECURE_API_USER
}

