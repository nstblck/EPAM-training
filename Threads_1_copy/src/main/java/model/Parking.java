package model;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Parking {

    private final static int MAX_CAR_IN_PARKING = 3; //макс число авто
    private static final int MAX_WAITING_TIME = 5;
    BlockingQueue<Car> parking;
    Lock monitor = new ReentrantLock();

    public Parking() {
        parking = new ArrayBlockingQueue<>(MAX_CAR_IN_PARKING);
    }

    public boolean addCar(Car car) {
        try {
            System.out.println(Thread.currentThread().getName() + " пытается запарковаться " + new Date());
            if (parking.offer(car, MAX_WAITING_TIME, TimeUnit.SECONDS)) {
                try {
                    monitor.lock();
                    System.out.println(Thread.currentThread().getName() + " завершил парковку " + new Date());
                } finally {
                    monitor.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " не дождался и уезжает на другую стоянку " + new Date());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void removeCar() {// авто постояло на парковочном месте и уехало, место освободилось
        try {
            monitor.lock();
            Car car = parking.take();
            System.out.println("Автомобиль " + car.getId() + " уехал " + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            monitor.unlock();
        }
    }
}