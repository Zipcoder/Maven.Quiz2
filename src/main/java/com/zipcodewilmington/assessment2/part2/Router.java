package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Router {
    Map<String, String> myMap;

    public Router(){
         myMap = new LinkedHashMap<>();
    }


    public void add(String path, String controller) {
         myMap.put(path, controller);
    }

    public Integer size() {
        return myMap.size();
    }

    public String getController(String path) {
        return myMap.get(path);
    }

    public void update(String path, String studentController) {
        myMap.replace(path, studentController);
    }

    public void remove(String path) {
    myMap.remove(path);
    }

    @Override
    public String toString (){
        StringBuilder mapAsString = new StringBuilder();
        for (String path : this.myMap.keySet()) {
            mapAsString.append(path).append(this.myMap.get(path)).append("\n");
        }
        return mapAsString.toString();

//(path + " -> " + myMap.get(path) + "\n");
//        String mapAsString = myMap.keySet().stream()
//                .map(key -> key + " -> " + myMap.get(key))
//                .collect(Collectors.joining(", ", "{", "}"));
//        return mapAsString;

//       StringBuilder sb  = new StringBuilder();
//        String result = "";
//      //loop over keys and get entry;
//        for (int i = 0; i < myMap.size(); i++)
//                result += path +
//
//            "%s -> %s", fff, myMap.get(path));


    }
}
