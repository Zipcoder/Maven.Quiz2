package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Router {
    private HashMap<String, String> map = new LinkedHashMap<>();

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();


        for(String s : map.keySet()) {
            stringBuilder.append(s).append(map.get(s)).append("\n");
        }
        return stringBuilder.toString();
    }
}
