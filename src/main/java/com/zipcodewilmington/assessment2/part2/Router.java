package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {
    public void add(String path, String controller) {
        HashMap<String, String> map
                = new HashMap<>();
        map.put(controller, path);
    }

    public Integer size() {

        HashMap<String, String> Pair
                = new HashMap<>();

        return Pair.size();
    }

    public String getController(String path) {
        HashMap<String, String> map
                = new HashMap<>();


        return map.get(path);
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
        HashMap<String, String> map
                = new HashMap<>();
        map.remove(path);
    }
}
