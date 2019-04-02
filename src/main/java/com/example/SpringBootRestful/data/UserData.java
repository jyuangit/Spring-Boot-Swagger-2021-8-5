package com.example.SpringBootRestful.data;

import com.example.SpringBootRestful.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    public static List<User> userData() {
        List<User> userList = new ArrayList<>();
        User userOne = new User(1, "小明");
        User userTwo = new User(2, "小红");
        User userThree = new User(3, "小花");
        userList.add(userOne);
        userList.add(userTwo);
        userList.add(userThree);
        return userList;
    }
}
