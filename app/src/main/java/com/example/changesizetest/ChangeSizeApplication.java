package com.example.changesizetest;

import android.app.Application;

import com.example.changesizetest.model.User;

public class ChangeSizeApplication extends Application {

    private User user;

    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Rafa","rafacarrascotm@gmail.com");
    }

    public User getUser() {
        return user;
    }
}
