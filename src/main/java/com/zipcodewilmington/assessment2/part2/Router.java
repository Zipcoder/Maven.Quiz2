package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;
import java.util.Map;


public class Router {

    Map<String, String> map;

    public Router() { this.map = new LinkedHashMap<>(); }

    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return this.map.size();
    }

    public String getController(String path) {
        return this.map.get(path);
    }

    public void update(String path, String studentController) {
        this.map.replace(path, studentController);
    }

    public void remove(String path) {
        this.map.remove(path);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()){
            String path = entry.getKey();
            String controller = entry.getValue();

            sb.append(path).append(controller).append('\n');
        }
        return sb.toString();
    }
}