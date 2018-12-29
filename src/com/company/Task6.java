package com.company;

public class Task6 { //написать метод который вычисляет, отрицательное число или нет.

    public boolean negative(double b) {
        if (b < 0) {
            System.out.println("Ваше число отрицательное!");
            return b<0;
        }
        else {
            System.out.println("Ваше число положительное!");
            return b>0;
        }
    }
}