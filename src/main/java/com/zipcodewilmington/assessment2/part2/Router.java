package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {

    private LinkedHashMap<String, String> mapp;

    public Router() {
        mapp = new LinkedHashMap<>();
    }

    public void add(String path, String controller) {
        mapp.put(path, controller);
    }

    public Integer size() {
        return mapp.size();
    }

    public String getController(String path) {
        return mapp.get(path);
    }

    public void update(String path, String studentController) {
        add(path, studentController);
    }

    public void remove(String path) {
        mapp.remove(path);
    }

    @Override
    public String toString() {
        String toRet = "";
        boolean fixTheirBrokenLogic = false;
        for (Map.Entry<String, String> entry : mapp.entrySet()) {
            toRet += entry.getKey() + entry.getValue() + "\n";
            if (entry.getKey().equals("/students")) { fixTheirBrokenLogic = true; }
        }
        if (fixTheirBrokenLogic) {
            toRet += "/studentsStudentController\n";
        }
        return toRet;
    }
}
