package com.epam_training.Cars;

import com.epam_training.Models.PassengerCarModel;

import java.util.Objects;

public class PassengerCar extends Car {
    public int passengerCapacity;

    public PassengerCar(int price, double fuelConsumption, double speed, PassengerCarModel model, int passengerCapacity) {
        super(price, fuelConsumption, speed, model);
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCar(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", passengersCapacity=" + passengerCapacity + '}');
    }

    @Override
    public int hashCode() {
            return Objects.hash(super.hashCode(), passengerCapacity);
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof PassengerCar) return true;
        if (super.equals(obj)) return true;
        PassengerCar car = (PassengerCar) obj;
        return passengerCapacity == car.passengerCapacity;
    }
}
