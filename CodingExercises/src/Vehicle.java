public class Vehicle {
    private String name;
    private int size;
    private int speed;
    private int gear;

    public Vehicle(String name,int size) {
        this.speed = 0;
        this.gear = 1;
        this.name = name;
        this.size = size;
    }

    public void steer() {
        System.out.println("Vehicle is steering");
    }

    public void move(int speed) {
        System.out.println("Vehicle is moving");
        this.speed += speed;
    }

    public void gearUp() {
        System.out.println("Vehicle is raising gears");
        this.gear += 1;
    }

    public void gearDown() {
        System.out.println("Vehicle is lowering gears");

        if (this.gear == 1)
        {}
        else this.gear -= 1;
    }

    public int getGear() {
        return this.gear;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

}
