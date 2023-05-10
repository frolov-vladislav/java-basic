package com.vladfrolov.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FruitBasket {

    Set<String> fruitsBasket = new TreeSet<>();

    public void addFruit(String fruit) {
        fruitsBasket.add(fruit);
    }

    public void addListOfFruits(List<String> fruitsList) {
        fruitsBasket.addAll(fruitsList);
    }

    public void removeFruit(String fruit) {
        fruitsBasket.remove(fruit);
    }

    public void removeAllFruits() {
        fruitsBasket.clear();
    }

    public void removeFruits(List<String> fruitsList) {
        fruitsList.forEach(fruitsBasket::remove); // == fruits.removeAll(fruitsList)
    }

    public boolean basketContainsFruit(String fruit) {
        return fruitsBasket.contains(fruit);
    }
}