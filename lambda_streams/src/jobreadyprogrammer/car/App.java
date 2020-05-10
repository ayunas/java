package jobreadyprogrammer.car;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    static List<Car> cars = Arrays.asList(
            new Car("nissan","350z","black",30000),
            new Car("nissan","murano","burnt orange",35000),
            new Car("toyota","highlander","green",38000),
            new Car("lexus","lx500","pearl white",71000),
            new Car("infiniti","qx56","silver",68000),
            new Car("ford","escort","green",18000)
    );

    public static void main(String[] args) {
//        System.out.println(cars);
//        printCarsPriceRange(30000,50000);
//        printCarsColor("black");

//        printCars(new Conditionable() {
//            @Override
//            public boolean test(Car c) {
//                int low = 30000;
//                int high = 35000;
//                return (c.price >= low && c.price <= high);
//            }
//        });

        printCars(new CarConditionable(){
            @Override
            public boolean test(Car c) {
                return c.color == "green";
            }
        });

        printCars(c -> c.color == "green");

        printCars(c -> c.price >= 30000 && c.price <= 50000);

        printGeneric(c -> c.make == "Toyota");

        printCarLib(c -> c.color == "green" && c.price < 100000);

        Function<Car,String> printPriceColor = c -> "price : " + c.price + " color : " + c.color;

        System.out.println(printPriceColor.apply(cars.get(0)));


    }

    static void printGeneric(Conditionable<Car> condition) {
        for (Car car : cars) {
            if(condition.test(car)) {
                System.out.println(car);
            }
        }
    }

    static void printCarLib(Predicate<Car> predicateCondition) {
        for(Car c : cars) {
            if(predicateCondition.test(c)) {
                System.out.println(c);
            }
        }
    }

    static void printCars(CarConditionable condition) {
        for(Car car : cars) {
            if(condition.test(car)) {
                System.out.println(car);
            }
        }
    }

    static void printCarsPriceRange(int low, int high) {
        for(Car c : cars) {
            if (c.price >= low && c.price <= high) {
                System.out.println(c);
            }
        }
    }

    static void printCarsColor(String color) {
        for(Car c : cars) {
            if (c.color == color) {
                System.out.println(c);
            }
        }
    }
}

@FunctionalInterface
interface CarConditionable {
    boolean test(Car c);
}

@FunctionalInterface
interface Conditionable<T> {
    boolean test(T t);
}