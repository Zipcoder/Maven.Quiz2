package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Router {

    private List<String> keys;
    private List<String> values;

    public Router(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void add(String path, String controller) {
        // should use that merge wizardry. handle it later
        keys.add(path);
        values.add(controller);
    }

    public Integer size() {
        return keys.size();
    }

    public String getController(String path) {
        if(keys.contains(path)) {
            return values.get(keys.indexOf(path));
        }
        else {
            return null;
        }
    }

    public void update(String path, String studentController) {
        // come back and do it properly if time. for now just pass the tests
        if(keys.contains(path)){
            values.set(keys.indexOf(path),studentController);
        }
    }

    public void remove(String path) {
        while(keys.contains(path)){
            values.remove(keys.indexOf(path));
            keys.remove(path);
        }
    }

    @Override
    public String toString(){
        StringBuilder sbuild = new StringBuilder();
        for(int i = 0; i < keys.size(); i++){
            sbuild.append(keys.get(i));
            sbuild.append(values.get(i));
            sbuild.append("\n");
        }

        return sbuild.toString();
    }
}
