package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    Map<String,String> myMap = new LinkedHashMap<>();
    StringBuilder myBuilder = new StringBuilder();

    public void add(String path, String controller) {
        myMap.put(path, controller);
        myBuilder.append(path);
        myBuilder.append(controller);
        myBuilder.append("\n");
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
        return myBuilder.toString();
    }
}
