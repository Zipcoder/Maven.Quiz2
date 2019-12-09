package com.zipcodewilmington.assessment2.part2;


import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    Map<String,String>map=new LinkedHashMap<>();

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
        map.put(path,studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //map.forEach()->System.out.println (path + " -> " + controller);
        for (String entry : map.keySet()) {
            sb.append( entry + map.get(entry) + "\n");
        } return sb.toString();
    }
}
