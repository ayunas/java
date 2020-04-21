import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chess {

    String piece;
    int strength;

    public static void main(String[] args) {
        List<Chess> pieces = new ArrayList<>();
        Chess p1 = new Chess("pawn",1);
        Chess p2 = new Chess("rook",5);
        Chess p3 = new Chess("knight",3);
        Chess p4 = new Chess("bishop",3);
        Chess p5 = new Chess("queen",9);

        Comparator<Chess> byStrength = Comparator.comparing(Chess::getStrength);
        Collections.sort(pieces,byStrength);

        pieces.forEach(p -> System.out.println(p.piece));
    }

    Chess(String p1, int strength) {
        this.piece = p1;
        this.strength = strength;
    }

    int getStrength() {
        return this.strength;
    }




}
