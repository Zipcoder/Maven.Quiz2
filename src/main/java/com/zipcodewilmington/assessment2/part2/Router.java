package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Router {
    Map<String, String> map = new HashMap<>();

    public void add(String path, String controller) {
        map.put(path,controller);
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
    public String toString(){
        String output = "";
        Set<String> keys = map.keySet();
        //Set<String> values = (Set<String>) map.values();
        for (String key : keys){
            output += key + map.get(key) + "\n";
        }
        return output;
    }
}
