package com.jackson.algorithms;

import org.junit.jupiter.api.Assertions;

public class Recursion_Stairs {
    public static void main(String[] args) {
        int input1 = 2;
        int input2 = 3;
        int input3 = 4;

        Assertions.assertEquals(2, solution(input1));
        Assertions.assertEquals(4, solution(input2));
        Assertions.assertEquals(7, solution(input3));
    }

    private static int solution(int input1) {
        if(input1 < 0) return 0;
        if(input1 == 1 || input1 == 0) return 1;
        return solution(input1-1) + solution(input1-2) + solution(input1-3);
    }
}
