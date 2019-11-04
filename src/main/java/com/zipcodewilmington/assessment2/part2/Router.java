package com.zipcodewilmington.assessment2.part2;

import java.util.List;

import static javax.swing.UIManager.put;

public class Router {
    public Router() {

    }
    public void add(String path, String controller) {
        put(path, controller);
    }

    public Integer size() {
        return null;
    }

    public String getController(String path) {
        /*for(){

        }*/
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
        remove(path);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
