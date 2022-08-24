package com.jackson.algorithms;

public class BracketChange {

    public static void main(String[] args) {

        String ex1 = "(()())()";
        String ex2 = ")(";
        String ex3 = "()))((()";

        System.out.println(solution(ex1).equals("(()())()"));
        System.out.println(solution(ex2).equals("()"));
        System.out.println(solution(ex3).equals("()(())()"));

    }

    private static String solution(String p) {
        String answer = "";
        return answer;
    }
}
