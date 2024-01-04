package com.mahesh.ECommerceProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.ECommerceProject.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}