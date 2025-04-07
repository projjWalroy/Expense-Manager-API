package com.projjwalroy.ExpenseTrackerAPI.repository;

import java.util.Optional;

import com.projjwalroy.ExpenseTrackerAPI.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}