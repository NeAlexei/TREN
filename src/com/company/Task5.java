package com.company;

import java.util.Scanner;

public class Task5 { //написать метод, который возвращает true если сумма переданных двух чисел - между 10 и 50

    Scanner sca = new Scanner(System.in);
    double s1 = sca.nextDouble();
    double s2 = sca.nextDouble();

    public double printIf(double s1, double s2){
    double c = s1 + s2;
        if ((c >= 10) && (c <= 50)) {
            System.out.println("Сумма вводимых чисел = " + c + " . Входит в диапазон!");
            return c;
        }
        else {
            System.out.println("Сумма вводимых чисел = " + c + " . Это вне диапазона!");
            return c;
        }
    }
}
