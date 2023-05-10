package com.vladfrolov.collections;

public class Main {

    public static void main(String[] args) {
        User user_1 = new User("nagibator_3000");
        user_1.addFavoriteFood("Steak");
        user_1.addFavoriteFood("Roll");
        user_1.getUser();
        User.getUsers();
    }
}