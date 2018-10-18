package com.github.madamusinski;

public class OperationMultiply implements Operation{

    @Override
    public double doOperation(Double num1, Double num2){
        Double wynik = num1 * num2;
        System.out.println("Wynikiem mnożenia " + num1 + " * " + num2 + " = " + wynik );
        return num1 * num2;
    }
}
