package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    public Map<String,String> map;

    public Router(){
        map = new HashMap<>();
    }
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
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    @Override
    public String toString() {
       StringBuilder mapString = new StringBuilder();
       for (String key: map.keySet()){
           mapString.append(key + " -> "+ map.get(key) +"\n");
       }
       return mapString.toString();
    }
}
