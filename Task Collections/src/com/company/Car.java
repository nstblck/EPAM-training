package com.company;

public enum Car {
    //Car Class A
    SMART(13500, 6.9, 145),
    SUZUKI(4200, 4, 155),

    //Car Class B
    PEUGEOT(4750, 4.6, 157),
    VOLKSWAGEN(14600, 7, 237),
    FORD(15000, 5.2, 208),

    //Car Class C
    HYUNDAI(13590, 9, 196),
    HONDA(19000, 8.1, 202),

    //Car Class D
    BMW3(25000, 5.4, 235),
    OPEL(27100, 6.5, 249),

    //Car Class E
    IMPALA(19800, 12, 237),
    BMW(42900, 15, 250),

    //Car Class F
    AUDI(95000, 7.7, 250),

    //Car Class S
    MASERATI(83500, 15.5, 295),
    CHEVROLET(54000, 28, 312),

    //Car Class M
    RENAULT(14500, 6, 176),
    CHRYSLER(11750, 7.9, 180),

    //Car Class J
    KIA(19700, 12, 201),
    CADILLAC(45000, 18.1, 240);

    private final int price;
    private final double fuelConsumption;
    private final double speed;

    Car(int price, double fuelConsumption, double speed) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
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
}