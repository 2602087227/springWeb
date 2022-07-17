package com.cjj.dao.imp;

import com.cjj.dao.UserDao;
import org.springframework.stereotype.Repository;

public class UserDaoImp implements UserDao {

    @Override
    public void save() {
        System.out.println("UserDao!");
    }
}
