package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {

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
        add(path, studentController);
    }

    public void remove(String path) {
        map.put(path, null);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for(String path : map.keySet()){
            str.append(path).append(" -> ").append(map.get(path)).append("\n");
        }

        return str.toString();
    }
}
