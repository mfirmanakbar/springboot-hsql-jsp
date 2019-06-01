package com.mfirmanakbar.repository;

import com.mfirmanakbar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
