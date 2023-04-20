package com.example.javaprojectBoot.service;

import com.example.javaprojectBoot.dao.UserDao;
import com.example.javaprojectBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImp implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    @Transactional(readOnly=true)
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
