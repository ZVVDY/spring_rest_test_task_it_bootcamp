package com.academy.spring_rest_test_task_it_bootcamp.model.repository;

import com.academy.spring_rest_test_task_it_bootcamp.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserRepository extends JpaRepository<User, Long>, PagingAndSortingRepository<User, Long> {
    Page<User> findAll(Pageable pageable);
}
