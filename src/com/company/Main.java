package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = s.nextInt();
        System.out.println("Введите второе  число: ");
        int secondNumber = s.nextInt();
        System.out.println("Введите третье  число: ");
        int thirdNumber = s.nextInt();
        System.out.println("Введите четвертое  число: ");
        int fourthNumber = s.nextInt();
        System.out.println("Введите пятое  число: ");
        int fifthNumber = s.nextInt();

        double resultSumma = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        System.out.println("Сумма всех введенных чисел : " + resultSumma);

        double resultAvarage = resultSumma / 5;
        System.out.println("Среднее значение введеных чисел : " + resultAvarage);

    }
}
