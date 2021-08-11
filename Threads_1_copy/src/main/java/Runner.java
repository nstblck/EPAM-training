import service.CarParkingService;

public class Runner {

    private final static int CARS_COUNT = 5;

    public static void main(String[] args) {
        new CarParkingService().tryToParkCar(CARS_COUNT);
    }
}
