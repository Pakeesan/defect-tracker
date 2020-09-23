package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
