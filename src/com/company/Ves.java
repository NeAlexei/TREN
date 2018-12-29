package com.company;

import java.util.Scanner;

public class Ves { //Сила тяжести на луне - 17% от земной, вычислить свой вес на луне.

    Scanner sca = new Scanner(System.in);
    int s = sca.nextInt();

    public double countVes(double s){ //передаем вес
        double result = s * 0.17;
        return result;
    }

}
