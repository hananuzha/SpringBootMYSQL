package com.genspark.demo.ServiceInterface;

import com.genspark.demo.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(int id);
    User addUser(User user);
    User updateUser(User user);
    String deleteUser(int id);
}
