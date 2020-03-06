package com.zipcodewilmington.assessment2.part2;

import java.util.Hashtable;

public class Router {
    Hashtable<String,String> test = new Hashtable<>();
    public void add(String path, String controller) {
        test.put(path,controller);
    }

    public Integer size() {
        return test.size();
    }

    public String getController(String path) {

        return test.get(path);
    }

    public void update(String path, String studentController) {
        test.replace(path,studentController);
    }

    public void remove(String path) {
        test.remove(path);
    }

    @Override
    public String toString() {
        return ""+ test.keySet() ;
    }
}
