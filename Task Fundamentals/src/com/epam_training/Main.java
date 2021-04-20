package com.epam_training;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Здравствуйте, " + name);
        // Отобразить в окне консоли аргументы командной строки в обратном порядке.
        System.out.println("Введите аргументы");
        String arguments = scanner.nextLine();
        String argumentsReverse = new StringBuffer(arguments).reverse().toString();
        System.out.println(argumentsReverse);
        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        Random random = new Random();
        System.out.println("Введите количество случайных чисел");
        int count = scanner.nextInt();
        int maxValue = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < count; i++) {
            int y = random.nextInt(maxValue);
            System.out.println(y); //с переходом на новую строку
            // System.out.print(y+" "); без перехода на новую строку
        }
        //Ввести целые числа как аргументы командной строки,
        // подсчитать их сумму (произведение) и вывести результат на консоль.
        int sum = 0;
        int product = 1;
        System.out.println("Введите целые числа для подсчета суммы и произведения");
        while (scanner.hasNextInt()) {
            int summand = scanner.nextInt();
            sum = sum + summand;
            product = product * summand;
        }
        scanner.nextLine();
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + product);

        //Ввести число от 1 до 12. Вывести на консоль название месяца,
        // соответствующего данному числу. Осуществить проверку корректности ввода чисел.
        System.out.println("Введите число");
        int numberOfMonth = scanner.nextInt();
        if (numberOfMonth > 12 || numberOfMonth <= 0) {
            System.out.println("Incorrect");
        } else if (numberOfMonth == 1) {
            System.out.println("Jan");
        } else if (numberOfMonth == 2) {
            System.out.println("Feb");
        } else if (numberOfMonth == 3) {
            System.out.println("March");
        } else if (numberOfMonth == 4) {
            System.out.println("Apr");
        } else if (numberOfMonth == 5) {
            System.out.println("May");
        } else if (numberOfMonth == 6) {
            System.out.println("Jun");
        } else if (numberOfMonth == 7) {
            System.out.println("Jul");
        } else if (numberOfMonth == 8) {
            System.out.println("Aug");
        } else if (numberOfMonth == 9) {
            System.out.println("Sept");
        } else if (numberOfMonth == 10) {
            System.out.println("Oct");
        } else if (numberOfMonth == 11) {
            System.out.println("Nov");
        } else {
            System.out.println("Dec");
        }
    }
}

