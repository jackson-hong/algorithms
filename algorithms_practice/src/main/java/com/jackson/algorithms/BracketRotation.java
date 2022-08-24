package com.jackson.algorithms;

public class BracketRotation {

    private static String[] rightStrArr = new String[] {"()","[]","{}"};

    public static void main(String[] args) {
        String ex1 = "[](){}";
        String ex2 = "}]()[{";
        String ex3 = "[)(]";
        String ex4 = "}}}";
        String ex5 = "([]){}";

//        System.out.println(solution(ex1) == 3);
//        System.out.println(solution(ex2) == 2);
//        System.out.println(solution(ex3) == 0);
//        System.out.println(solution(ex4) == 0);
        System.out.println(solution(ex5));
    }

    private static int solution(String s) {
        int answer = 0;

        if(s.length() == 0) return 0;

        for(int i = 0; i < s.length(); i++){
            char firstChar = s.charAt(0);
            s = s.substring(1) + firstChar;
            if(validStr(s))answer++;
        }

        return answer;
    }

    private static boolean validStr(String s) {
        String temp = s;
        for(int i = 0; i < rightStrArr.length; i++){
            System.out.println(temp);
            if(temp.contains(rightStrArr[i])){
                temp = temp.replace(rightStrArr[i], "");
                i = -1;
            }
            if(temp.equals(""))return true;
        }
        return false;
    }
}
