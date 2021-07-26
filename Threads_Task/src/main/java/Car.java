public class Car implements Runnable{
    
    private static final int waitingTime = 30;
    private int id;
    private Parking parking;

    public int getId() {
        return id;
    }

    public Car(Parking parking, int id) {
        this.parking = parking;
        this.id = id;
    }

    public void run() {
        ParkingPlace parkingPlace = null;
        try {
            while (parkingPlace == null) {
                System.out.println("Car is trying to park");
                parkingPlace = parking.tryParking(this, waitingTime);
            }
            System.out.println("Car parking");
            parkingPlace.reservePlace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (parkingPlace != null) {
                System.out.println("Car has finished parking");
                parking.endParking(parkingPlace);
            }
        }
    }
}
