package com.github.madamusinski;

public class OperationAdd implements Operation{



    @Override
    public double doOperation(Double num1, Double num2){
        Double wynik = num1 + num2;
        System.out.println("Wynikiem dodawania " + num1 + " + " + num2 + " = " + wynik );
        return num1 + num2;
    }


}
