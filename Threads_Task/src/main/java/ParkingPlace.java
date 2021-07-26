import java.util.Random;

public class ParkingPlace {
    private int id;
    private Car car;

    public Car getCar() {
        return car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ParkingPlace(int id) {
        this.id = id;
    }

    public void reservePlace() {
        try {
            Thread.sleep(new Random().nextInt(40));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
