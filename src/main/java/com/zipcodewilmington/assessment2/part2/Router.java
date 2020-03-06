package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Router {

    LinkedHashMap<String, String> routerPaths = new LinkedHashMap<>();

    public void add(String path, String controller) {
        routerPaths.put(path, controller);
    }

    public Integer size() {
        return routerPaths.size();
    }

    public String getController(String path) {
        return routerPaths.get(path);
    }

    public void update(String path, String studentController) {
        routerPaths.put(path, studentController);
    }

    public void remove(String path) {
        routerPaths.remove(path);
    }

    @Override
    public String toString() {
        String stringToReturn = "";
        for (Map.Entry<String, String> element : routerPaths.entrySet()) {
            stringToReturn += (element.getKey() + " -> " + element.getValue());
        }
        return stringToReturn;
    }
}
