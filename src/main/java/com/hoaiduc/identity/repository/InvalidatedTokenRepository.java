package com.hoaiduc.identity.repository;

import com.hoaiduc.identity.entity.InvalidedToken;
import com.hoaiduc.identity.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvalidatedTokenRepository extends JpaRepository<InvalidedToken, String> {
}
