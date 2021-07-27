import java.util.ArrayList;
import java.util.List;

    public class Parking {
        private final static int maxAttemptsCount = 3;
        private int count = 0;

        List<ParkingPlace> places = new ArrayList<>();

        public Parking() {
        }

        public Parking(List<ParkingPlace> places) {
            this.places.addAll(places);
        }

        private boolean searchFreeParkingPlace(ParkingPlace place, Car car) {
            if (place.getCar() == null) {
                place.setCar(car);
                places.remove(place);
                return true;
            }
            return false;
        }

        public synchronized ParkingPlace tryParking(Car car, int waitingTime) {
            int numberOfTrying = 0;
            boolean success = false;
            while (!success) {
                for (ParkingPlace parkingPlace : places) {
                    if (searchFreeParkingPlace(parkingPlace, car)) {
                        return parkingPlace;
                    }
                }
                if (success = true) {
                    try {
                        numberOfTrying++;
                        if (checkAttemptsCount(numberOfTrying, waitingTime, car)) {
                            return null;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            return null;
        }

        public synchronized void endParking(ParkingPlace place) {
            place.setCar(null);
            places.add(place);
            notify();
        }

        private synchronized boolean checkAttemptsCount(int attemptsCount, int waitingTime, Car car) throws InterruptedException {
            if (attemptsCount == maxAttemptsCount) {
                System.out.println("Car ended parking");
                wait(waitingTime);
                return true;
            } else {
                System.out.println("Car searching free parking place");
                wait(waitingTime);
            }
            return false;
        }
    }
