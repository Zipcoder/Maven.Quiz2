package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {

    private Map<String,String> mapResult = new HashMap<String,String>();


    public void add(String path, String controller) {

        mapResult.put(path,controller);
    }

    public Integer size() {
        return mapResult.size();
    }

    public String getController(String path) {
        String returnedString = "";
        String listElement = "";

        for (int i = 0; i < mapResult.size(); i++){
            listElement = mapResult.get(path);
            returnedString += listElement;
        }

        return (mapResult.size() > 0) ? returnedString : null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {

        mapResult.remove(path);
    }

    @Override
    public String toString() {
        String [] keyValues = new String [mapResult.size()];
        StringBuilder result = new StringBuilder();

        mapResult.keySet().toArray(keyValues);

        for (int i = (keyValues.length - 1); i >= 0; i--){
            result.append(keyValues[i]).append(mapResult.get(keyValues[i])).append('\n');
        }
        result.toString();

        return result.toString();
    }
}
