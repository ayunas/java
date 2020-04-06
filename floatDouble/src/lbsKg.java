public class lbsKg {

    public static void main(String[] args) {
        System.out.println("lbs to kg program");

        double lbs = 200d;
        double kgs = lbs * .45359237d;

        System.out.println("converted kilograms : " + kgs);

        //BigDecimal appropraite for precise calculations.  due to floating point errors.
    }
}
