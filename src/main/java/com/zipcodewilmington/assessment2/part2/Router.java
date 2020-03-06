package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {

    public Map<String,String> mymap = new HashMap<>();

    public void add(String path, String controller) { this.mymap.put(path,controller); }

    public Integer size() {
        return this.mymap.size();
    }

    public String getController(String path) {
        return this.mymap.get(path);
    }

    public void update(String path, String studentController) { this.mymap.put(path,studentController);}

    public void remove(String path) { this.mymap.remove(path); }

//    @Override
//    public String toString() {
//        return "Router{" +
//                "mymap=" + mymap +
//                '}';
//    }
}

