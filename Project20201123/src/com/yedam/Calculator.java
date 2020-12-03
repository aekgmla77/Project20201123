package com.yedam;

public class Calculator {
    private String color;
    static double pi = 3.14;
    public void setColor(String color) {
    	this.color = color;
    }
    public static int plus(int a, int b) { //static이 붙으면 소속이 class가 됨.
    	return a + b;
    }
    public static int minus(int a , int b) {
    	return a - b;
    }
}
