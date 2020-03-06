package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {
    HashMap<String, String> theMap;

    public Router(){
        this.theMap = new HashMap<String,String>();
    }
    public void add(String path, String controller) {
        this.theMap.put(path,controller);
    }

    public Integer size() {
        return theMap.size();
    }

    public String getController(String path) {
        return theMap.get(path);
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
}
