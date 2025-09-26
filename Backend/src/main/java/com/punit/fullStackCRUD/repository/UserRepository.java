package com.punit.fullStackCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.punit.fullStackCRUD.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
