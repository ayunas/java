public class FeetInchCM {

    public static void main(String[] args) {
        if (args.length < 2) System.exit(-1);

        int feet = Integer.parseInt(args[0]);
        int inches = Integer.parseInt(args[1]);
        double cm = footInchToCm(feet,inches);
        System.out.println(cm);
    }

    public static double footInchToCm(int feet, int inches) {
        //combine and convert feet/inches to CM
        if (feet < 0 || inches < 0 || inches > 12) return -1;

        double totalInches = 12*feet + inches;
        double cm = totalInches * 2.54;

        System.out.println();


        return cm;
    }




}
