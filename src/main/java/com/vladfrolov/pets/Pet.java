package com.vladfrolov.pets;

import java.util.ArrayList;

public class Pet {
    protected PetKind kind;
    protected String name;
    protected double weight;
    protected int age;
    protected String favoriteFood;
    protected static ArrayList<String> childrenNames = new ArrayList<>();
    protected ArrayList<Pet> children = new ArrayList<>();
    protected Gender gender;

    protected String getName() {
        return name;
    }

    protected double getWeight() {
        return weight;
    }

    protected PetKind getKind() {
        return kind;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    protected Pet(PetKind kind, Gender gender, String name, double weight, int age, String favoriteFood) {
        this.kind = kind;
        this.gender = gender;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    protected static void showAllChildren() {
        System.out.println("\nList of children names:");
        for (String child : childrenNames) {
            System.out.println(child);
        }
        System.out.println();
    }

    protected void showChildren() {
        for (Pet child : children) {
            System.out.println("\n" + "Children of pet with name " + this.name + ": ");
            System.out.println("\t Name: " + child.name);
            System.out.println("\t Weight: " + child.weight);
        }
    }

    public void eat(String food, double foodWeight) {
        System.out.println("\n" + this.kind + " " + this.name + " are eating " + food);
        setWeight(getWeight() + foodWeight);
    }
}