package com.example.loose;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabase();
        UserWebService userWebService = new UserWebService();

        UserManager userManager = new UserManager(userWebService);
        System.out.println(userManager.getUserInfo());
    }
}
