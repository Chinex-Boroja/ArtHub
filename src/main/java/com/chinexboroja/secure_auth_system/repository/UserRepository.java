package com.chinexboroja.secure_auth_system.repository;

import com.chinexboroja.secure_auth_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
