package com.jackson.algorithms;

import org.junit.jupiter.api.Assertions;
public class Recursion_CountX {

    public static void main(String[] args) {
        String input = "axbxcxd";
        Assertions.assertEquals(3, solution(input));
    }

    private static int solution(String input) {
        if(input.length() == 0) return 0;
        if(input.charAt(0) == 'x') return 1 + solution(input.substring(1));
        return solution(input.substring(1));
    }


}
