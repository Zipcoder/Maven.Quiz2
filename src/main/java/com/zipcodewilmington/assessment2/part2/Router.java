package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    Map<String, String> controllerMap = new HashMap();

    public void add(String path, String controller) {
        controllerMap.put(path, controller);
    }

    public Integer size() {
        return controllerMap.size();
    }

    public String getController(String path) {
        return controllerMap.get(path);
    }

    public void update(String path, String studentController) {
        controllerMap.replace(path, studentController);
    }

    public void remove(String path) {
        controllerMap.remove(path);
    }

}
