package com.cjj.domain;

import java.util.List;

public class Vo {
    private List<User> userList;
    public Vo() {
    }

    public Vo(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "userList=" + userList +
                '}';
    }
}
