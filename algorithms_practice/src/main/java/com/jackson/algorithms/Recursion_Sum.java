package com.jackson.algorithms;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class Recursion_Sum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Assertions.assertEquals(15, solution(list));
    }

    private static int solution(List<Integer> nums){
        if(nums.size() == 1) return nums.get(0);
        return nums.get(0) + solution(nums.subList(1, nums.size()));
    }
}
