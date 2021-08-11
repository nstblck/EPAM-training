package model;

public class Car implements Runnable {
    private int id;
    private Parking parking;


    public Car(int id, Parking parking) {
        this.id = id;
        this.parking = parking;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        parking.addCar(this);
    }
}