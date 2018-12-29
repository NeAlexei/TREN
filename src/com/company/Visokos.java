package com.company;

import java.util.Scanner;

public class Visokos { /*Вводим год. Проверить, является ли год вИсокосным или нет. Високосным является каждый 4-й
 год за ислючением каждого 100-го и каждого 400-го*/

    Scanner sca = new Scanner(System.in);
    int s = sca.nextInt();

    public boolean verifyYear(int s){ //или да, или нет - boolean
        return ((s % 4 == 0) && (s % 100 != 0) || (s % 400 == 0));
        }
    }

//  % - деление без остатка
//  && -
//  || -
