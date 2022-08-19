package com.javarush.task.pro.task11.task1104;



public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        Double db = Double.parseDouble(string);
        long res = Math.round(db);
        System.out.println(res);
    }
}
