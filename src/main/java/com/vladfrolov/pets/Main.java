package com.vladfrolov.pets;


public class Main {
    public static void main(String[] args) {
        Cat jin = new Cat(Gender.FEMALE, "Jin", 5, 1, "Chicken");
        Pet jinJn = jin.giveBirth("Jin.jn");
        Pet.showAllChildren();
        jin.showChildren();
        jinJn.eat("Milk", 0.02);
        System.out.println(jinJn.weight);

        Parrot pirate = new Parrot(Gender.FEMALE, "Pirate", 0.04, 2, "Corn");

        Pet pirateJn = pirate.giveBirth("Pirate.jn");
        Pet sailor = pirate.giveBirth("Sailor");

        pirate.showChildren();
        Pet.showAllChildren();
    }
}