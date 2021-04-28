package com.thisproject.springtest.repository;

import com.thisproject.springtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
