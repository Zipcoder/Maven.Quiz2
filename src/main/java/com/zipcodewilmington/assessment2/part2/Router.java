package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {

    private HashMap<String, String> map;

    public Router() {
        map = new HashMap<>();
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

    @Override
    public String toString(){
        String results = "";
        for(Map.Entry<String, String> entry : map.entrySet()){
            results += entry.getKey() + " -> " + entry.getValue() + "\n";
        }
        return results;
    }
}
