package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    HashMap<String, String> map = new HashMap<String,String>();

    public void add(String path, String controller) {
        map.put(controller,path);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
}
