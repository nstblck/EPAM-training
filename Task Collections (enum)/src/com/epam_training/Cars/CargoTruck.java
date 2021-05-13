package com.epam_training.Cars;

import java.util.Objects;

public class CargoTruck extends Car {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", cargoCapacity=" + loadCapacity + '}');
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof CargoTruck) return true;
        if (super.equals(obj)) return true;
        CargoTruck car = (CargoTruck) obj;
        return loadCapacity == car.loadCapacity;
    }
}

