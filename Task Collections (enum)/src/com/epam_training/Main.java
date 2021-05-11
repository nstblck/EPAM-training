package com.epam_training;

import com.epam_training.Cars.Car;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отсортированный автопарк по расходу топлива:" + taxiStation.sortByFuelConsumption());
        System.out.println();
        System.out.println("Полная стоимость таксопарка составляет:" + taxiStation.calculateCost());
        System.out.println();
        System.out.println("Введите значения скорости \"от\" и \"до\" для подбора автомобиля");
        System.out.println(taxiStation.getCarsSelectedBySpeed(scanner.nextInt(), scanner.nextInt()));
        System.out.println("Автомобили, подходящие под веденные параметры, выше: ");
    }
}