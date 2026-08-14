package com.bits.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bits.security.entity.User;

import jakarta.persistence.Id;

public interface Repo extends JpaRepository<User,Long> {
	

}
