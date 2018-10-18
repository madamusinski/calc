package com.github.madamusinski;

public class OperationDivision  extends ArithmeticException implements Operation{

    @Override
    public double doOperation(Double num1, Double num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Dzielenie przez 0");

        } else {
            Double wynik = num1 / num2;
            System.out.println("Wynikiem dzielenia " + num1 + " / " + num2 + " = " + wynik);
            return num1 / num2;
        }
    }
}
