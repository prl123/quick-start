package com.dilato.DAO;

import com.dilato.entity.User;

import java.util.List;


/**
 * Created by DELL on 2016/1/22.
 */
public interface UserDAO {
    public int save(User u);
    public List<User> findAll();
}