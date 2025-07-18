package com.example.loose;

public class UserWebService implements UserDataProvider {

    @Override
    public String getUserDetails() {
       return "User from web service";
    }

}
