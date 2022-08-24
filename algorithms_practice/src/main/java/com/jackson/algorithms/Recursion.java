package com.jackson.algorithms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        String json = "[" +
                "1," +
                "2," +
                "3," +
                "[4,5,6]," +
                "7," +
                "[8," +
                "[9,10,11," +
                "[12,13,14]" +
                "]" +
                "]," +
                "[15,16,17,18,19," +
                "[20,21,22," +
                "[23,24,25," +
                "[26,27,29]" +
                "],30, 31" +
                "], 32"+
                "], 33" +
                "]";

        final ObjectMapper objectMapper = new ObjectMapper();
        List list = new ArrayList();

        try {
            list = objectMapper.readValue(json, List.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        solution(list);
    }

    private static void solution(List input){
        input.forEach(num -> {
            if(num instanceof List) solution((List) num);
            else System.out.println(num);
        });
    }
}
