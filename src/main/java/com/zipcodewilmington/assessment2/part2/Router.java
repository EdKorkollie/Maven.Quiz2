package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {
    private Map<String, String> map = new TreeMap<>();
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
    public String toString() {

        String jon = "";
        for(Map.Entry<String, String > entry : map.entrySet()) {
            jon += String.format(entry.getKey() + entry.getValue());
        }
        return jon;
    }
}
