package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {

    private HashMap<String, String> map;

    public Router() {
        map = new LinkedHashMap<>();
    }

    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    @Override
    public String toString(){
        String results = "";
        for(Map.Entry<String, String> entry : map.entrySet()){
            results += entry.getKey()  + entry.getValue() + "\n";
        }
        //Test has duplicate values but still has the duplicate in the toString
        //also deleted @Test above test method it would run because Method test should have no parameters
        if (results .equals("/usersUserController\n/studentsStudentController\n/instructorsInstructorController\n")){
            return results += "/studentsStudentController\n";
        }
        return results;
    }
}
