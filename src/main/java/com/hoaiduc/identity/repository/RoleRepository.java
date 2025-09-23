package com.hoaiduc.identity.repository;

import com.hoaiduc.identity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
