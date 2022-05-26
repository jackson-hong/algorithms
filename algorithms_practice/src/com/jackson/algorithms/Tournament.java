package com.jackson.algorithms;

public class Tournament {

    /*
    * programmers : https://programmers.co.kr/learn/courses/30/lessons/12985?language=java
    * */
    public static void main(String[] args) {
        int[] ex1 = {4,7};
        int[] ex2 = {6,7};
        int[] ex3 = {5,7};
        int[] ex4 = {1,2};

//        System.out.println(solution(8, ex1[0], ex1[1]) == 3);
//        System.out.println(solution(8, ex2[0], ex2[1]) == 2);
//        System.out.println(solution(8, ex3[0], ex3[1]) == 2);
//        System.out.println(solution(16, ex3[0], ex3[1]) == 2);
//        System.out.println(solution(2, ex4[0], ex4[1]) == 1);
        System.out.println(solution(16, ex4[0], ex4[1]) == 1);
    }

    /*
    *
    * 둘 중의 작은 수가 n/2 보다 작은지 확인 ->
    * 작으면 큰 수가 n/2보다 작은지 확인 - 큰 경우 = 주어진 n이 2의 지수값 => 2의 지수값
    * 작은 경우
    * 둘 중의 작은 수가 n/2/2 보다 작은지 확인 ->
    * ...
    *
    *
    *
    * */

    private static int solution(int n, int a, int b) {
        int answer = 0;
        int exponent = Math.getExponent(n);
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);

        for(int i = exponent - 1; i >= 0; i--){
            int comparer = (int) Math.pow(2,i);
            if(comparer >= smaller && comparer < bigger) return i + 1;
            if(comparer >= smaller && comparer >= bigger) continue;
            smaller = smaller - comparer;
            bigger = bigger - comparer;
        }

        return answer;
    }
}
