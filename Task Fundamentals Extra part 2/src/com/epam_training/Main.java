package com.epam_training;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        int max = 0;
        int min = Integer.MAX_VALUE;
        String minStr = null;
        String maxStr = null;
        ArrayList<String> array = new ArrayList<String>();
        while (scanner.hasNextInt()) {
            int argument = scanner.nextInt();
            String argumentString = String.valueOf(argument);
            array.add(argumentString);
            if (argumentString.length() < min) {
                min = argumentString.length();
                minStr = argumentString;
            }
            if (max < argumentString.length()) {
                max = argumentString.length();
                maxStr = argumentString;
            }
        }
        System.out.println("Самое короткое число - " + minStr + ", имеет длину " + min);
        System.out.println("Самое длинное число - " + maxStr + ", имеет длину " + max);

        // Вывести числа в порядке возрастания (убывания) значений их длины.
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(array, comparator);
        System.out.println("Отсортированный массив чисел по их длине:");
        System.out.println(array);
    }
}
