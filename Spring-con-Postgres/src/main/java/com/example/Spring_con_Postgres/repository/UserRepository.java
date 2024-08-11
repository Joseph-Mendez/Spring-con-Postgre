package com.example.Spring_con_Postgres.repository;

import com.example.Spring_con_Postgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

