package com.batuhankaradeniz.hotelbooking.repository;

import com.batuhankaradeniz.hotelbooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // JpaRepository already implements but still can be put
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    User findByUsername(String email);
}
