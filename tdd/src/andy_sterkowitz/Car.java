package andy_sterkowitz;

public class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    boolean isModel(String make) {
        if (this.make == make) {
            return true;
        }
        System.out.println("incorrect model");
        return false;
    }
}
