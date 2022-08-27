package com.jackson.algorithms;

import org.junit.jupiter.api.Assertions;

public class Recursion_Reverse {
    public static void main(String[] args) {
        String str = "abcdefg";
        Assertions.assertEquals("gfedcba", solution(str));
    }

    private static String solution(String str){
        if(str.length()==1) return ""+str.charAt(0);
        return solution(str.substring(1)) + str.charAt(0);
    }
}
