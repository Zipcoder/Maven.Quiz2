package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Router {
    HashMap<String, String> map;

    public Router() {
        this.map = new LinkedHashMap<String, String>();
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
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    @Override
    public String toString() {
        HashMap<String, String> linkedMap = new LinkedHashMap(map);
        String result = "";
        for (Map.Entry<String, String> pair : map.entrySet()) {
            //System.out.println(pair.getKey() + " -> " + pair.getValue());
            result += pair.getKey() + " -> " + pair.getValue();
        }
        return result;
    }
}
