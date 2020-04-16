public class Circle {

    double radius;

    public static void main(String[] args) {
        Circle c = new Circle(25);
        double area = c.getArea();
        System.out.println(String.format("%.3f",area));
        System.out.println(area);
    }

    public Circle(double radius) {
        if (radius < 0) this.radius = 0;
        else this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * (radius*radius);
    }


//
//    double getRadius


}
