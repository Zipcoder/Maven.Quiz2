package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    Map<String, String> routing;

    public Router()
    {
        routing = new HashMap<>();
    }

    public void add(String path, String controller)
    {
            routing.put(path, controller);
    }

    public Integer size()
    {
        return routing.size();
    }

    public String getController(String path) {
        return routing.get(path);
    }

    public void update(String path, String studentController)
    {
        routing.replace(path, studentController);
    }

    public void remove(String path)
    {
        routing.remove(path);
    }

    @Override
    public String toString()
    {
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, String> pair : routing.entrySet()) {
            String path = pair.getKey();
            String controller = pair.getValue();

            output.append(path).append(controller).append('\n');
        }

        return output.toString();
    }
}
