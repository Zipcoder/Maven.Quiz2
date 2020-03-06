package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    Map<String,String> myMap = new LinkedHashMap<>();

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

    @Override
    public String toString() {
        StringBuilder myBuilder = new StringBuilder();
        for (Map.Entry<String,String> n: myMap.entrySet()) {
            myBuilder.append(n.getKey());
            myBuilder.append(n.getValue());
            myBuilder.append("\n");
        }
        return myBuilder.toString();
    }
}
