package com.epam_training;

import java.util.*;

public class TaxiStation {
    private List<Car> taxiStation = new ArrayList<>();


    public TaxiStation() {
        taxiStation.add(new Car(13500, 6.9, 145, CarsModels.SMART));
        taxiStation.add(new Car(18400, 7.5, 214, CarsModels.SUZUKI));
        taxiStation.add(new Car(20200, 5.6, 185, CarsModels.AUDI));
        taxiStation.add(new Car(17000, 6.9, 204, CarsModels.FORD));
        taxiStation.add(new Car(75000, 12, 280, CarsModels.CHEVROLET));
        taxiStation.add(new Car(67000, 12, 265, CarsModels.MASERATI));
        taxiStation.add(new Car(57000, 11, 230, CarsModels.BMW));
        taxiStation.add(new Car(12400, 5.9, 160, CarsModels.OPEL));
        taxiStation.add(new Car(45000, 18.1, 240, CarsModels.CADILLAC));
        taxiStation.add(new Car(19700, 12, 201, CarsModels.KIA));
        taxiStation.add(new Car(19000, 8.1, 202, CarsModels.HONDA));
    }

    public List<Car> sortByFuelConsumption() {
        List<Car> taxiStationSortByFuel = new ArrayList<Car>(taxiStation);
        Collections.sort(taxiStationSortByFuel, new Comparator<Car>() {
            public int compare(Car p1, Car p2) {
                return Double.compare(p1.getFuelConsumption(), p2.getFuelConsumption());
            }
        });
        return taxiStationSortByFuel;
    }

    public int calculateCost() {
        int fullCostOfTaxiStation = 0;
        for (int i = 0; i < taxiStation.size(); i++) {
            fullCostOfTaxiStation += taxiStation.get(i).getPrice();
        }
        return fullCostOfTaxiStation;
    }

    public List<Car> getCarsSelectedBySpeed(int from, int to) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carsSelectedBySpeed = new ArrayList<>();
        for (int i = 0; i < taxiStation.size(); i++) {
            if (taxiStation.get(i).getSpeed() >= from && taxiStation.get(i).getSpeed() <= to) {
                carsSelectedBySpeed.add(taxiStation.get(i));
            }
        }
        return carsSelectedBySpeed;
    }
}
