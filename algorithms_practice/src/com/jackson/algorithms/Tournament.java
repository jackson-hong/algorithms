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
    * n = 2^x
    * 작은 수가 2^(n-1) 보다 작거나 같고, 큰 수가 2^(n-1) 보다 클 경우
    * 대진표에서 n번째에서 만나게 된다.
    * */

    private static int solution(int n, int a, int b) {
        int answer = 0;
        // 지수 반환
        int exponent = Math.getExponent(n);
        // 큰 수
        int bigger = Math.max(a, b);
        // 작은 수
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
