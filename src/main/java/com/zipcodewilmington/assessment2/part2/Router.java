package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    private Map<String, String> routerMap;

    public Router(Map<String, String> routerMap)
    {
        this.routerMap = routerMap;
    }

    public Router() {
        this.routerMap = new LinkedHashMap<String, String>();
    }

    public void add(String path, String controller)
    {
        routerMap.put(path, controller);
    }

    public Integer size() {
        return routerMap.size();
    }

    public String getController(String path) {
        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        routerMap.put(path, studentController);
    }

    public void remove(String path) {
        routerMap.remove(path);
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String,String> entry : routerMap.entrySet()) {
            output.append(entry.getKey()+entry.getValue()+"\n");
        }
        return output.toString();
    }
}
