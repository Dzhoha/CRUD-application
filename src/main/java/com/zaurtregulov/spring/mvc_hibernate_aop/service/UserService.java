package com.zaurtregulov.spring.mvc_hibernate_aop.service;


import com.zaurtregulov.spring.mvc_hibernate_aop.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);


    public User getUser(int id);

    public void deleteUser(int id);
}
