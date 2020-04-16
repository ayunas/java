public class Car extends Vehicle {

    public Car(String name, int size) {
        super(name,size);
    }

    public static void main(String[] args) {
        Car c = new Car("suburban",2000);
        c.steer();
        c.gearUp();
        c.gearUp();
        int gear = c.getGear();
        System.out.println("Car is currently on gear: " + gear);
        int speed = c.getSpeed();
        System.out.println("Car is currently going : " + speed);
        c.gearDown();
        c.gearDown();
        c.gearDown();
        c.gearDown();
        c.gearDown();
        gear = c.getGear();
        System.out.println(c.getGear());
        String name = c.getName();
        System.out.println(name);
    }

    @Override
    public void steer() { //method overriding in inheritance a.k.a. polymorphism
        super.steer();
        System.out.println("Car is steering, to be specific...");
    }

    @Override
    public void gearUp() {
    super.gearUp();
        System.out.println("Car raised the gear...");
    }

    @Override
    public void gearDown() {
        super.gearDown();
        System.out.println("Car lowered the gear");
    }
}




