package com.epam_training;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        sayHello();
        System.out.println("Введите аргументы");
        reverseArguments();
        System.out.println("Введите количество случайных чисел");
        randomNumbers();
        System.out.println("Введите целые числа для подсчета суммы и произведения");
        getSumAndProduct();
        System.out.println("Введите число");
        getMonth();
    }


    public static void sayHello() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Здравствуйте, " + name);
    }

    public static void reverseArguments() {
        Scanner scanner = new Scanner(System.in);
        String arguments = scanner.nextLine();
        String argumentsReverse = new StringBuffer(arguments).reverse().toString();
        System.out.println(argumentsReverse);
    }

    public static void randomNumbers() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int maxValue = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < count; i++) {
            int y = random.nextInt(maxValue);
            System.out.println(y); //с переходом на новую строку
            // System.out.print(y+" "); без перехода на новую строку
        }
    }

    public static void getMonth() {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        if (numberOfMonth > 12 || numberOfMonth <= 0) {
            System.out.println("Incorrect");
        } else {
            switch (numberOfMonth) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Feb");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("Apr");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("Jun");
                    break;
                case 7:
                    System.out.println("Jul");
                    break;
                case 8:
                    System.out.println("Aug");
                    break;
                case 9:
                    System.out.println("Sept");
                    break;
                case 10:
                    System.out.println("Oct");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;
            }
        }
    }


    public static void getSumAndProduct() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        while (scanner.hasNextInt()) {
            int summand = scanner.nextInt();
            sum = sum + summand;
            product = product * summand;
        }
        scanner.nextLine();
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + product);
    }
}