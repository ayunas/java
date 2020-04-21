import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceOperator {

    public static void main(String[] args) {
        Stream stream = Stream.of("amir", "sofia", "sheena", "mom", "dad", "nadia", "ibby", "yusuf");

        stream.forEach(System.out::println);

        System.out.println("\n=================================");
        Stream stream2 = Stream.of("amir", "sofia", "sheena", "mom", "dad", "nadia", "ibby", "yusuf");
//        stream2.forEach(s -> System.out.println(s));

        Object[] streamArray = stream2.toArray();
        System.out.println(Arrays.toString(streamArray));

        Chess pawn = new Chess("pawn",1);
        Chess rook = new Chess("rook",5);
        Chess queen = new Chess("queen",9);
        Chess knight = new Chess("knight",3);
        Chess bishop = new Chess("bishop",3);
        Chess king = new Chess("king",0);
        ArrayList<Chess> pieces = new ArrayList<>();
        pieces.addAll(Arrays.asList(pawn,rook,queen,knight,bishop,king));

        System.out.println(pieces);

//        ArrayList<Integer> pieceStrengths = pieces.forEach(Chess::getStrength);
        //get practice using the method reference operator (::) to return a strengths of all the chess pieces.

        ArrayList<Integer> strengths = new ArrayList<>();

        for (Chess piece : pieces) {
            int str = piece.getStrength();
            strengths.add(str);
        }

//        strengths.clear();
        strengths.sort()

        System.out.println(strengths);
    }




}
