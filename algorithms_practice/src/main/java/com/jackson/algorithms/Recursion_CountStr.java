package com.jackson.algorithms;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class Recursion_CountStr {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList( "ab", "c", "def", "ghij");
        int result = solution(strs);
        Assertions.assertEquals(10, result);
    }

    private static int solution(List<String> strs) {
        if(strs.size() == 0) return 0;
        return strs.get(0).length() + solution(strs.subList(1, strs.size()));
    }
}
