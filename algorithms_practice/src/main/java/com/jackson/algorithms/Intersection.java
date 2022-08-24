package com.jackson.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection {
    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {0,2,4,6,8};
        List<Integer> result = new ArrayList<>();

        Map<Integer, Boolean> map = new HashMap();
        for (int input:input1) {
            map.put(input, true);
        }

        for(int num : input2){
            if(map.get(num) != null){
                result.add(num);
            }
        }

        System.out.println(result);
    }
}
