package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;

public class Router {
    private LinkedHashMap<String, String> linkMap;

    public Router(){
        linkMap = new LinkedHashMap<>();
    }
    public void add(String path, String controller) {
        linkMap.put(path, controller);
    }

    public Integer size() {
        return linkMap.size();
    }

    public String getController(String path) {
        return linkMap.get(path);
    }

    public void update(String path, String studentController) {
        linkMap.put(path, studentController);
    }

    public void remove(String path) {
        linkMap.remove(path);
    }
}
