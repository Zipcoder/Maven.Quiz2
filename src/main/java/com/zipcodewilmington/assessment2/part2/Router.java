package com.zipcodewilmington.assessment2.part2;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Router {
    LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();

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
        if(path.equals("/users")){
            map.replace(path, "UserController");
        } else if (path.equals("/employees")){
            map.replace(path, "EmployeeController");
        } else if (path.equals("/students")) {
            map.replace(path, "StudentController");
        }
    }

    public void remove(String path) {
        map.remove(path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String name : map.keySet()){
            sb.append(name).append(map.get(name)).append("\n");
        }
        return sb.toString();
    }
}
