package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(array1));
        arr.addAll(Arrays.asList(array2));
        Integer[] added = new Integer[arr.size()];
        return arr.toArray(added);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] arr = Arrays.copyOfRange(array, 0, index);
        Integer[] arr1 = Arrays.copyOfRange(array, index,array.length);

        return merge(arr1, arr);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer freqA1 = Collections.frequency(Arrays.asList(array1), valueToEvaluate);
        Integer freqA2 = Collections.frequency(Arrays.asList(array2), valueToEvaluate);
        return freqA1 + freqA2;
    }

    public Integer mostCommon(Integer[] array) {
        int counter;
       // int tempCount = array;
        Integer output = array[0];
        int temCounter = 0;
        for(int i = 1; i < array.length; i++){
            counter = 1;
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    counter++;
                }

            }
            if(counter > temCounter) {
                temCounter = counter;
                output = array[i];
            }
        }

            return output;
    }
}
