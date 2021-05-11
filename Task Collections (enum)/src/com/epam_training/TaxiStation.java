package com.epam_training;

import com.epam_training.Cars.Car;
import com.epam_training.Cars.PassengerCar;
import com.epam_training.Models.PassengerCarModel;

import java.util.*;

public class TaxiStation {
    private List<Car> taxiStation = new ArrayList<>();


    public TaxiStation() {
        taxiStation.add(new PassengerCar(13500, 6.9, 145, PassengerCarModel.SMART,2));
        taxiStation.add(new PassengerCar(18400, 7.5, 214, PassengerCarModel.SUZUKI, 2));
        taxiStation.add(new PassengerCar(20200, 5.6, 185, PassengerCarModel.AUDI,4));
        taxiStation.add(new PassengerCar(17000, 6.9, 204, PassengerCarModel.FORD,4));
        taxiStation.add(new PassengerCar(75000, 12, 280, PassengerCarModel.CHEVROLET,5));
        taxiStation.add(new PassengerCar(67000, 12, 265, PassengerCarModel.MASERATI,2));
        taxiStation.add(new PassengerCar(57000, 11, 230, PassengerCarModel.BMW,5));
        taxiStation.add(new PassengerCar(12400, 5.9, 160, PassengerCarModel.OPEL,4));
        taxiStation.add(new PassengerCar(45000, 18.1, 240, PassengerCarModel.CADILLAC,4));
        taxiStation.add(new PassengerCar(19700, 12, 201, PassengerCarModel.KIA,5));
        taxiStation.add(new PassengerCar(19000, 8.1, 202, PassengerCarModel.HONDA,5));
    }

    public List<Car> sortByFuelConsumption() {
        List<Car> taxiStationSortByFuel = new ArrayList<Car>(taxiStation);
        Collections.sort(taxiStationSortByFuel, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return Double.compare(o1.getFuelConsumption(), o2.getFuelConsumption());
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
        List<Car> carsSelectedBySpeed = new ArrayList<>();
        for (int i = 0; i < taxiStation.size(); i++) {
            if (taxiStation.get(i).getSpeed() >= from && taxiStation.get(i).getSpeed() <= to) {
                carsSelectedBySpeed.add(taxiStation.get(i));
            }
        }
        return carsSelectedBySpeed;
    }
}
