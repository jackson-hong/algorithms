package com.jackson.algorithms;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_EvenArr {
    public static void main(String[] args) {
        List<Integer> integers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> integers2 = Arrays.asList(10,12,14,15,18);

        List<Integer> result1 = solution(integers1, new ArrayList<>());
        List<Integer> result2 = solution(integers2, new ArrayList<>());

        Assertions.assertEquals(result1.size(), 2);
        Assertions.assertEquals(result2.size(), 4);
    }

    private static List<Integer> solution(List<Integer> integers1, List<Integer> result) {
        if(integers1.size() == 0) return result;
        if(integers1.get(0) % 2 == 0) {
            result.add(integers1.get(0));
            return solution(integers1.subList(1, integers1.size()), result);
        }
        return solution(integers1.subList(1, integers1.size()), result);
    }
}
