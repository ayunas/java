public class SpeedConverter {

    public static long kmMiles(double km) {

        if (km < 0) return -1;

        double miles = (km / 1.609);

        return Math.round(miles);
    }

    public static void printMiles(double km) {

        if (km < 0) System.out.println("Invalid KM value");
        else {
            long miles = kmMiles(km);
            System.out.println(miles);
        }
    }
}
