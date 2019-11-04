package com.zipcodewilmington.assessment2.part2;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Router {
    String path;
    String controller;
    Map<String, String> map = new HashMap<>();


    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    public String toString() {
        String mapString = "";
        for (String k : map.keySet()) {
            mapString += k + map.keySet() +"\n";
        }
        return mapString;

    }
}
