package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {

    HashMap<String, String> newMap = new HashMap<>();

    public void add(String path, String controller) {
        newMap.put(path, controller);

    }

    public Integer size() {
        return newMap.size();
    }

    public String getController(String path) {

        return newMap.get(path);
    }

    public void update(String path, String studentController) {

        newMap.replace(path, studentController);
    }

    public void remove(String path) {

        newMap.remove(path);
    }

}
