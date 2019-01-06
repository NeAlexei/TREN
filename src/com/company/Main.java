package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Task 1: Введите количество галлонов: ");
//        Gallon gallon = new Gallon();
//        System.out.println("1: в " + gallon.s + " галлонах - " + gallon.countGallon(gallon.s) + " литров." + "\n" + "---");
//
//        System.out.println("Task 2: Введите свой вес: ");
//        Ves ves = new Ves();
//        System.out.println("2: " + ves.s + " кг на Луне - это " + ves.countVes(ves.s) + " кг." + "\n" + "---");
//
//        System.out.println("Task 3: Введите год: ");
//        Visokos visokos = new Visokos();
//        System.out.println("3: Високосность года " + visokos.s + " - " + visokos.verifyYear(visokos.s) + "\n" + "---");
//
//        System.out.println("Task 4: a=2, b=3, c=10, d=5, e=2 " + "6 + 4 = 10");
//        Virazjenie virazjenie = new Virazjenie();
//        System.out.println("4: a * b + (c / d * e) = " + virazjenie.countVirazh(2,3,10,5,2) + "\n" + "---");

//        System.out.println("Task 5: Введите два числа: ");
//        Task5 task5 = new Task5();
//        task5.printIf(task5.s1, task5.s2);

        System.out.println("Отрицательное ли число");
        Task6 task6 = new Task6();
        System.out.println("Ыыыы " + task6.negative(-8) + "\n" + "---");

        System.out.println("Какой-то текст");
        Priva priva = new Priva();
        priva.writeHello("Илларион Бенедиктович");

        System.out.println("Введите ваше количество лет: ");
        Task7 task7 = new Task7();
        System.out.println(task7.yearsOld(task7.age));

    }
}

