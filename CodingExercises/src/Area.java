public class Area {

    public static void main(String[] args) {
        if (args.length == 0) System.exit(-1);

        int radius;
        int length;
        int width;
        if (args.length == 1) {
            radius = Integer.parseInt(args[0]);
            double circle = area(radius);

            System.out.println("Area of the circle is: " + String.format("%.2f",circle));
        } else {
            length = Integer.parseInt(args[0]);
            width = Integer.parseInt(args[1]);
            double square = area(length, width);
            System.out.println("Area of the square is: " + String.format("%.2f", square));
        }

    }

    public static double area(double radius) {
        if (radius < 0) return -1.0;

        System.out.println(Math.PI);
        System.out.println(Math.pow(radius,2));

        return Math.PI*(Math.pow(radius,2));
    }

    public static double area(double length, double width) {
        if (length < 0 || width < 0) return -1.0;

        return length * width;
    }


}

