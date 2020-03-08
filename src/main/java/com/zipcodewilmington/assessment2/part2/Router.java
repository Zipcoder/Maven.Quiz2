package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Router {

    Map<String, String> map = new LinkedHashMap<>();
    StringBuilder str = new StringBuilder();

    public void add(String path, String controller) {
        map.put(path, controller);
        str.append(path);
        str.append(controller);
        str.append('\n');
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
        return str.toString();
    }
}
