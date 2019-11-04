package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {
    private Map<String,String > routerMap = new TreeMap<>();
    public void add(String path, String controller) {
        routerMap.put(path,controller);
        System.out.println(path + controller);
    }

    public Integer size() {

        return routerMap.size() ;
    }

    public String getController(String path) {

        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        routerMap.put(path,studentController);
    }

    public void remove(String path) {
        routerMap.remove(path);
    }
}
