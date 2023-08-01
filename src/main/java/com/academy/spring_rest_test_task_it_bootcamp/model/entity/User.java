package com.academy.spring_rest_test_task_it_bootcamp.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "surname", nullable = false)
    @Length(min = 2, max = 40, message = "Maximum of 40 characters")
    private String surname;
    @Column(name = "first_name", nullable = false)
    @Length(min = 2, max = 20, message = "Maximum of 20 characters")
    private String firstName;
    @Column(name = "middle_name", nullable = false)
    @Length(min = 2, max = 40, message = "Maximum of 40 characters")
    private String middleName;
    @Column(name = "email", nullable = false)
    @Length(max = 50, message = "Maximum of 50 characters")
    private String email;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;

    @Override
    public String toString() {
        return "User{"
                + "Surname=" + surname
                + ", First name='" + firstName + ", Middle name='" + middleName +
                ", E-mail='" + email + '\''
                + "roles=" + roles
                + '}';
    }
}
