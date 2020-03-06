package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {
    HashMap<String,String> myMap = new HashMap<>();

    public void add(String path, String controller) {
        myMap.put(path, controller);
    }

    public Integer size() {
        return myMap.size();
    }

    public String getController(String path) {
        return myMap.get(path);
    }

    public void update(String path, String studentController) {
        myMap.replace(path, myMap.get(path), studentController);
    }

    public void remove(String path) {
        myMap.remove(path, myMap.get(path));
    }
}
