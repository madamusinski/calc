package com.github.madamusinski;

import java.util.Locale;
import java.util.Scanner;

public class StandardCalculator extends Calculator{
    private int choice;

    @Override
    void initialize(){
        System.out.println("Inicjalizowanie Kalkulatora");
    }
    @Override
    void showMenu(){
        boolean loop = true;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Double tempDouble1 = 0.;
        Double tempDouble2 = 0.;
        while(loop){
            System.out.println("======MENU=====");
            System.out.println(".1 Dodawanie");
            System.out.println(".2 Odejmowanie");
            System.out.println(".3 Mnozenie");
            System.out.println(".4 Dzielenie");
            System.out.println(".5 Zakoncz Program");
            choice = 0;
            choice = scanner.nextInt();
            switch(choice){
                case 1: {
                    System.out.println("Wybrano dodawanie");
                    System.out.println("Podaj pierwsza liczbe dodawania w formacie np. 2.7 : ");

                    tempDouble1 = scanner.nextDouble();
                    System.out.println("Podaj druga liczbe: ");
                    tempDouble2 = scanner.nextDouble();
                    OperationAdd add = new OperationAdd();
                    add.doOperation(tempDouble1, tempDouble2);
                    continue;
                }
                case 2: {
                    System.out.println("Wybrano odejmowanie");
                    System.out.println("Podaj pierwsza liczbe odejmowania w formacie np. 2.7 : ");

                    tempDouble1 = scanner.nextDouble();
                    System.out.println("Podaj druga liczbe: ");
                    tempDouble2 = scanner.nextDouble();
                    OperationSubstract substract = new OperationSubstract();
                    substract.doOperation(tempDouble1, tempDouble2);
                    break;
                }
                case 3: {
                    System.out.println("Wybrano mnożenie");
                    System.out.println("Podaj pierwsza liczbe mnożenia w formacie np. 2.7 : ");
                    tempDouble1 = scanner.nextDouble();
                    System.out.println("Podaj druga liczbe: ");
                    tempDouble2 = scanner.nextDouble();
                    OperationMultiply multiply = new OperationMultiply();
                    multiply.doOperation(tempDouble1, tempDouble2);
                    break;
                }
                case 4:{
                    System.out.println("Wybrano dzielenie");
                    System.out.println("Podaj liczbę, która ma być podzielona w formacie np. 2.7 : ");
                    tempDouble1 = scanner.nextDouble();
                    System.out.println("Podaj dzielnik: ");
                    tempDouble2 = scanner.nextDouble();
                    OperationDivision divide = new OperationDivision();
                    divide.doOperation(tempDouble1, tempDouble2);
                    break;
                }
                case 5:
                    System.out.println("Konczenie programu");
                    loop=false;
                    break;
                default:
                    System.out.println("Podaj wartosci pomiedzy 1-5");

            }
        }

    }



}
