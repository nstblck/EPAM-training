import java.util.ArrayList;
import java.util.List;

public class Runner {
    private final static int numberOfParkingPlaces = 5;
    private final static int numberOfCars = 7;

    public static void main(String[] args) {
        List<ParkingPlace> places = new ArrayList<>();
        for (int i = 1; i < numberOfParkingPlaces; i++) {
            places.add(new ParkingPlace(i));
        }
        Parking parking = new Parking(places);
        for (int i = 1; i < numberOfCars; i++) {
            Thread thread = new Thread(new Car(parking, i));
            thread.start();
        }
    }
}
