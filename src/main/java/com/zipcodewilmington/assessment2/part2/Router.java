package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    private Map<String, String> routerMap;

   /* public Router(Map<String, String> routerMap)
    {
        this.routerMap = routerMap;
    }*/

    public Router() {
        this.routerMap = new LinkedHashMap<String, String>();
       // this.routerMap = new HashMap<>();
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

        //routerMap.forEach(<String , String> entry -> entry.getKey() + entry.() ));
        //routerMap.forEach();

       /* for (Map.Entry<String,String> entry : routerMap.entrySet()) {
            output.append(entry.getKey()+entry.getValue()+"\n");
        } */

        for (String entry: routerMap.keySet())
        {
            output.append(entry + routerMap.get(entry) + "\n");
        }
        return output.toString();
    }
}
