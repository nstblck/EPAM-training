package com.epam_training;


public class Car {
    private int price;
    private double fuelConsumption;
    private double speed;
    private CarsModels model;

    public Car(int price, double fuelConsumption, double speed, CarsModels model) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.model = model;
    }

    public CarsModels getModel() {
        return model;
    }

    public void setModel(CarsModels model) {
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
