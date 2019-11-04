package com.zipcodewilmington.assessment2.part2;

public class Router {
    private String result = "";

    public void add(String path, String controller) {
        result = controller;
    }

    public Integer size() {
        return null;
    }

    public String getController(String path) {
        return result;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
        result = null;
    }
}
