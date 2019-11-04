package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    public void add(String path, String controller) {
         Map<String, String> myMap = new HashMap<>();
         myMap.put(path, controller);
    }

    public Integer size() {
        return null;
    }

    public String getController(String path) {
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
}
