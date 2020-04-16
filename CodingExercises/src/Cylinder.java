public class Cylinder extends Circle {

    private double height;

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(3,10);
        double area = cyl.getArea();
        System.out.println(area);
        double vol = cyl.getVolume();
        System.out.println(String.format("%.2f",vol));
    }

    public Cylinder(int radius, int height) {
        super(radius);
        if (height < 0) this.height = 0;
        else this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }



}
