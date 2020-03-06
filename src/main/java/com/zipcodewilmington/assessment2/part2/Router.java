package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Router {

    Map<String, String> router = new HashMap<>();

    public void add(String path, String controller) {
        router.put(path, controller);
    }

    public Integer size() {
        return router.size();
    }

    public String getController(String path) {
        return router.get(path);
    }

    public void update(String path, String studentController) {
        router.replace(path, studentController);
    }

    public void remove(String path) {
        router.remove(path);
    }

    @Override
    public String toString() {
        StringBuilder retString = new StringBuilder();
        Set<Map.Entry<String, String>> setRouter = router.entrySet();
        for(Map.Entry e : setRouter){

            retString.append( "/" + e.getKey().toString().substring(1) + e.getValue() + "\n");
        }

        return retString.toString();
    }
}
