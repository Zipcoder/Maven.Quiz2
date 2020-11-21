package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Router {

    Map<String, String> testMap = new HashMap<>();

    public void add(String path, String controller) {

        testMap.put(path, controller);
    }

    public Integer size() {

        return testMap.size();
    }

    public String getController(String path) {

        return testMap.get(path);
    }

    public void update(String path, String studentController) {
        testMap.put(path, studentController);
    }

    public void remove(String path) {
        testMap.remove(path);
    }

    public String toString(String path, String Controller) {
//        StringBuilder keyValues = new StringBuilder("");
//        Iterator<String> keyValueSet = testMap.keySet().iterator();
//        while (keyValueSet.hasNext()) {
//            keyValues.append("\n").append(keyValueSet.next()).append(" -> ").append(testMap.get(keyValueSet.next()));
//
//        }

        return ""; //keyValues.toString();
    }
}
