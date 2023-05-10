package com.vladfrolov.collections;

import java.util.HashMap;
import java.util.Map;

public class DogsBase {

    public HashMap<String, String> dogsBase = new HashMap<>();

    public DogsBase(String ownerName, String dogName) {
        this.dogsBase.put(ownerName, dogName);
    }

    public void addADog(String ownerName, String dogName) {
        dogsBase.putIfAbsent(ownerName, dogName);
    }

    public void removeADog(String ownerName, String dogName) {
        dogsBase.remove(ownerName, dogName);
    }

    public boolean dogIsExist(String dogName) {
        return dogsBase.containsValue(dogName);
    }

    public boolean ownerIsExist(String ownerName) {
        return dogsBase.containsKey(ownerName);
    }

    public void addADogs(Map<String, String> dogsBase) {
        this.dogsBase.putAll(dogsBase);
    }
}