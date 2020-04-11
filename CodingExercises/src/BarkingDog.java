public class BarkingDog {

    public static void main(String[] args) {
        boolean getup = wakeup(false,23);
        System.out.println(getup);
    }

    public static boolean wakeup(boolean barking, int hour) {

        if (!barking) return false;

        if (hour < 0 || hour > 23) {
            return false;
        } else if (hour < 8 || hour > 22) {
            return true;
        } else {
           return false;
       }
    }
}
