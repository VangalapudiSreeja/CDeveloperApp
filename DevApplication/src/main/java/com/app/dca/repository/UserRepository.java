package com.app.dca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dca.entity.UserD;

public interface UserRepository extends JpaRepository<UserD, String>{

}
