package com.company;

import java.util.Scanner;

public class Gallon { //В одном галлоне - 3.78 литра. Написать программу, которая переводит галлоны в литры.

    Scanner sca = new Scanner(System.in);
    double s = sca.nextInt();

    public double countGallon(double s){
        double litrov = s * 3.7854;
        return litrov;
    }
}
