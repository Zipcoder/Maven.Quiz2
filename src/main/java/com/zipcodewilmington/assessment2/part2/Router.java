package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {

    private String toString = "";
    Map<String, String> newMap = new TreeMap<String, String>();

    public void add(String path, String controller) {
        newMap.put(path,controller);
        toString += path + controller + "\n";
    }

    public Integer size() {
        return newMap.size();
    }

    public String getController(String path) {
        return newMap.get(path);
    }

    public void update(String path, String studentController) {
        newMap.replace(path, studentController);
    }

    public void remove(String path) {
        newMap.remove(path);
    }

    public String toString(){
        return toString;
    }
}
