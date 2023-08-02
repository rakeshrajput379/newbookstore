package com.bookstore.newbookstore.services;

import com.bookstore.newbookstore.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){

        store.add(new User(UUID.randomUUID().toString(),"rakesh","rakesh@gmail.com"));

        store.add(new User(UUID.randomUUID().toString(),"ramesh","ramesh@gmail.com"));

        store.add(new User(UUID.randomUUID().toString(),"ankit","anikit@gmail.com"));

        store.add(new User(UUID.randomUUID().toString(),"pooja","pooja@gmail.com"));



    }

    public List<User> getUserList(){

        return store;
    }
}
