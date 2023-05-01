package com.vladfrolov.pets;


import java.util.Random;

public class Cat extends Pet implements PetActions {

    public Cat(Gender gender, String name, int weight, int age, String favoriteFood) {
        super(PetKind.CAT, gender, name, weight, age, favoriteFood);

    }

    public void talk() {
        System.out.println("\n" + getName() + " meows");

    }

    public Pet giveBirth(String name) {
        if (this.gender == Gender.FEMALE) {
            boolean female = new Random().nextBoolean();
            Gender gender = female ? Gender.FEMALE : Gender.MALE;
            double random = new Random().nextDouble();
            double start = 0.06;
            double end = 0.16;
            double randomWeight = start + (random * (end - start));
            double scale = Math.pow(10, 3);
            double weight = Math.ceil(randomWeight * scale) / scale;
            Pet child = new Pet(getKind(), gender, name, weight, 0, "Молоко");
            System.out.println("\n" + getKind() + " with name: " + name + " was born!");
            childrenNames.add(child.name);
            children.add(child);
            return child;
        } else {
            System.out.println("\nThe male is unable to give birth.");
            throw new Error("This is not Female");
        }
    }
}