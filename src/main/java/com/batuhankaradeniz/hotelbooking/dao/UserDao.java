package com.batuhankaradeniz.hotelbooking.dao;

import com.batuhankaradeniz.hotelbooking.entity.User;

// DAO pattern for user
public interface UserDao {
    public User findUserByEmail(String email);
    public User findUserByUsername(String username);

    public void saveUser(User user);
}
