package com.vladfrolov.collections;

import com.github.javafaker.Faker;

import java.util.*;

public class User {

    private final static Faker FAKER = new Faker();
    private final String login;
    private final static HashMap<Long, User> users = new HashMap<>();
    private final Set<String> favoriteFood = new TreeSet<>();


    public User(String login) {
        this.login = login;
        Long id = FAKER.number().randomNumber(10, false);
        users.putIfAbsent(id, this);
    }

    public void printFavoriteFood() {
        for (String food : favoriteFood) {
            System.out.println("\t" + food);
        }
    }

    public void addFavoriteFood(String favoriteFood) {
        this.favoriteFood.add(favoriteFood);
    }

    public static void getUsers() {
        Set<Map.Entry<Long, User>> set = users.entrySet();
        for (Map.Entry<Long, User> longUserEntry : set) {
            System.out.println("\n" + longUserEntry.getKey() + ": " +
                    longUserEntry.getValue().login);
        }
    }

    public void getUser() {
        System.out.println(login + ": \n" + "  Favorite food: ");
        printFavoriteFood();
    }
}