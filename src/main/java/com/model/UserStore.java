package com.util;

import com.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 22.04.2017.
 */
public class UserStore {
    private List<User> users;

    public UserStore(){
        this.users = new ArrayList<User>();
    }

    public void add(User user){
        this.users.add(user);
    }

    public User get(Integer index){
        return this.users.get(index);
    }

    public List<User> getUsers(){
        return this.users;
    }

}
