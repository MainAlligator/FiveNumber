package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять цифр: ");
        int value = input.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        while (value > 0) {
            result.add(value % 10);
            value = value / 10;
        }
        int sum = 0;
        for (Integer integer : result) sum += integer;
        System.out.println("Сумма введенных цифр:  " + sum);

        int average = sum / result.size();
        System.out.println("Среднее значение цифр: " + average);

    }
}










