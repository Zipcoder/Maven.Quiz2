package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Router {
    Map<String,String> mp= new TreeMap<>();
    String string = "";

    public void add(String path, String controller) {
        mp.put(path,controller);
        string += path+controller+"\n";
    }

    public Integer size() {
        return mp.size();
    }

    public String getController(String path) {
        return mp.get(path);
    }

    public void update(String path, String studentController) {
        mp.put(path,studentController);
    }

    public void remove(String path) {
        mp.remove(path);
    }

    @Override
    public String toString() {
//        StringBuilder s = new StringBuilder();
//        for(Map.Entry<String,String> e :mp.entrySet()){
//            s.insert(0,e.getKey()+e.getValue()+"\n");
//        }
//        return s.toString();
        return string;
    }
}
