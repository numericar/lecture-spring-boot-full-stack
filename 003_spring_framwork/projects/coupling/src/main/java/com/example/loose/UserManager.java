package com.example.loose;

public class UserManager {
    private UserDataProvider userDatabase;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDatabase = userDataProvider;
    }

    public String getUserInfo() {
        return this.userDatabase.getUserDetails();
    }
}
