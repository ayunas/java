public class Table {
    String name;
    int legs;
    String color;

    Table(String name, int legs, String color) {
        this.name = name;
        this.legs = legs;
        this.color = color;
    }

    String[] showTable() {
        String[] table = {this.name, Integer.toString(this.legs), this.color};
        return table;
    }

}
