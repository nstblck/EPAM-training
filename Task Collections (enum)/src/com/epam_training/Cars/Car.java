package com.epam_training.Cars;


import com.epam_training.Models.PassengerCarModel;
import com.epam_training.PersistentData;

import java.io.*;

public class Car extends PersistentData {
    private int price;
    private double fuelConsumption;
    private double speed;
    private PassengerCarModel model;

    public Car(int price, double fuelConsumption, double speed, PassengerCarModel model) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.model = model;
    }

    public Car() {

    }

    public PassengerCarModel getModel() {
        return model;
    }

    public void setModel(PassengerCarModel model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
}
