package service;

import model.Car;
import model.Parking;

public class CarParkingService {
    public void tryToParkCar(int carsCount){
        Parking parking = new Parking();

        for (int i = 1; i <= carsCount; i++) {
            Thread carThread = new Thread(new Car(i, parking));
            carThread.setName("Автомобиль " + i);
            carThread.start();
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parking.removeCar();
    }
}
