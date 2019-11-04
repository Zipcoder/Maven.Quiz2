package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Router {
    private List<String> result = new ArrayList<>();
    //private String result = "";

    public void add(String path, String controller) {
        result.add(controller);
    }

    public Integer size() {
        return result.size();
    }

    public String getController(String path) {
        String returnedString = "";
        String listElement = "";

        for (int i = 0; i < result.size(); i++){
            listElement = result.get(i);
            returnedString += listElement ;
        }
        return (result.size() > 0) ? returnedString : null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
        result.clear();
    }
}
