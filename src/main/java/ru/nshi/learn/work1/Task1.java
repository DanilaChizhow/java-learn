/**
 * Написать программу, которая определяет, является ли число «счастливым».
 * Осуществить проверку для шестизначных чисел.
 * Число пользователь вводит с клавиатуры.
 **/

package ru.nshi.learn.work1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Work.some();
    }

    public static class Work {
        public static void some() {

            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            int i1 = i / 100000 % 10;
            int i2 = i / 10000 % 10;
            int i3 = i / 1000 % 10;
            int i4 = i / 100 % 10;
            int i5 = i / 10 % 10;
            int i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                System.out.println("Lucky number!!!");
            }
            else {
                System.out.println("Wrong number");
            }
        }
    }
}