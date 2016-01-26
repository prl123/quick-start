package com.dilato.service;

import com.dilato.entity.User;

import java.util.List;

/**
 * Created by DELL on 2016/1/22.
 */
public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
}
