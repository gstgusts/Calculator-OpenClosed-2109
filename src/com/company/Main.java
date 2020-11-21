package com.company;

public class Main {

    public static void main(String[] args) {
	   var addition = new Addition(5, 7);

	   var calculator = new Calculator();

	   calculator.calculate(addition);

        System.out.println(addition.getResult());
    }
}
