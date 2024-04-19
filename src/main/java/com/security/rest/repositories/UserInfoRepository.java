package com.security.rest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.rest.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

}
