package com.batuhankaradeniz.hotelbooking.repository;

import com.batuhankaradeniz.hotelbooking.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String roleName);
}
