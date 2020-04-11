import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static void main(String[] args) {
        boolean same = areEqualByThreeDecimalPlaces(4.526,4.5269);
        System.out.println(same);
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        BigDecimal d1 = new BigDecimal(one).setScale(3, RoundingMode.UP);
        BigDecimal d2 = new BigDecimal(two).setScale(3, RoundingMode.DOWN);
        System.out.println(d1.doubleValue());
        System.out.println(d2.doubleValue());
        return d1.doubleValue() == d2.doubleValue();
    }
}
