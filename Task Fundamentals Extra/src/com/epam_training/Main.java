package com.epam_training;

import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // Ввести с консоли размерность матрицы[n] [n].
        // Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        arrayFillByRandom(array);
        printArray(array);
        sortByColumn(array);
        printArray(array);
        summBeforeFirstAndSecondPositiveElements(array);
    }

    //заполнение массива рандомом
    public static void arrayFillByRandom(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон значений матрицы");
        int range = scanner.nextInt();
        for (int n1 = 0; n1 < array.length; n1++) {
            for (int n2 = 0; n2 < array.length; n2++) {
                array[n1][n2] = (int) (Math.random() * (2 * range + 1)) - range;
            }
        }
    }


    //Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
    public static void sortByColumn(int[][] array) {
        System.out.println("Введите номер столбца для сортировки");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = 0; i < array.length; i++)
            for (int u = i + 1; u < array.length; u++) {
                if (array[i][k] > array[u][k]) {
                    for (int j = 0; j < array.length; j++) {
                        int template = array[i][k];
                        array[i][k] = array[u][k];
                        array[u][k] = template;
                    }
                }
            }
    }

    //Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
    public static void summBeforeFirstAndSecondPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int value = array[i][j];
                if (value >= 0) {
                    for (int k = j + 1; j < array.length; k++) {
                        if (array[i][k] >= 0) {
                            sum = value + array[i][k];
                        }
                        break;
                    }
                    break;
                }
            }
            System.out.println("Сумма первых двух положительных элементов "+ i + "-той строки равна " + sum);
        }
    }


    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}