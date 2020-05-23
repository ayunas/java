import java.util.Arrays;

public class Playground {

    public static void main(String[] args) {
        Object[] obj = {1,2,3,"5",true,10.2003};
        System.out.println(Arrays.toString(obj));

        String[][] strings = new String[10][5];
        strings[0][1] = "howdy";
        strings[1][2] = "peter";
        strings[3][3] = "julian";

        System.out.println(Arrays.toString(strings));

        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.deepToString(nums));


    }
}
