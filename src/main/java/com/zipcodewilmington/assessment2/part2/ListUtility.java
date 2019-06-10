package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {

        return list.add(i);
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {

        return new ArrayList<>(new HashSet<>(list));
    }

    public String join() {
        String jon = list.toString();
        return jon.substring(1, jon.length()-1);
    }

    public Integer mostCommon() {
        Integer[] transformed = new Integer[list.size()];
        ArrayList arrUtil = new ArrayList();
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
