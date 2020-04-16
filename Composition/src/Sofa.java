public class Sofa {
    String name;
    int seats;
    String color;

    public Sofa(String name, int seats, String color) {
        this.name = name;
        this.seats = seats;
        this.color = color;
    }

    String[] showSofa() {
        String[] sofaStuff = {this.name, Integer.toString(this.seats), this.color};
        return sofaStuff;
    }

    public String getName() {
        return this.name;
    }

    public int getSeats() {
        return this.seats;
    }

    public String getColor() {
        return this.color;
    }





}
