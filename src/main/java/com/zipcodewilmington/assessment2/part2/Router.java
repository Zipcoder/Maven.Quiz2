package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {

    HashMap<String, String> map = new HashMap<>();

    public Router(){

    }

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
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
}
