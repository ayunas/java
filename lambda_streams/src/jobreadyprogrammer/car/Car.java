package jobreadyprogrammer.builtin;

public class Car {
    String make;
    String model;
    String color;
    int price;

    public Car(String make, String model, String color, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void printCar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("nissan","350z","black",28000);
        car.printCar();
    }

}
