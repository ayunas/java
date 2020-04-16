import java.util.Arrays;

public class Room {
        Table table;
        Sofa sofa;

    public Room() {
        this.table = new Table("pearl",4,"pearly white");
        this.sofa = new Sofa("single",1,"creme");
    }

    String[][] showRoom() {
        String[] sofastuff = this.sofa.showSofa();
        String[] tablestuff = this.table.showTable();
        String[][] roomstuff = {sofastuff, tablestuff};
        return roomstuff;
    }

    public static void main(String[] args) {
        Room family = new Room();
//        System.out.println(family.sofa);
        System.out.println(Arrays.deepToString(family.showRoom()));
        System.out.println(family.sofa.name);
    }
}
