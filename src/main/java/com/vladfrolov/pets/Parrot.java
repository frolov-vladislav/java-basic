package com.vladfrolov.pets;

import java.util.Random;

public class Parrot extends Pet implements PetActions {

    protected Parrot(Gender gender,String name, double weight, int age, String favoriteFood) {
        super(PetKind.PARROT, gender, name, weight, age, favoriteFood);
    }

    public void talk() {
        System.out.println("\n" + getName() + " tweets");
    }

    public Pet giveBirth(String name) {
        if (this.gender == Gender.FEMALE) {
            boolean female = new Random().nextBoolean();
            Gender gender = female ? Gender.FEMALE : Gender.MALE;
            Pet child = new Pet(getKind(), gender, name, 0.001, 0, "Worms");
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
