package com.example.tight;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        return this.userDatabase.getUserDetails();
    }
}
