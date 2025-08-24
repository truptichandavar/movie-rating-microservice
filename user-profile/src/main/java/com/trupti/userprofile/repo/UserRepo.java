package com.trupti.userprofile.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trupti.userprofile.dao.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String>{

}
