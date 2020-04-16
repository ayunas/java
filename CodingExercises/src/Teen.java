public class Teen {
  //a number is "teen" if it is in the range 13 - 19


    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        hasTeen(num0,num1,num2);
    }

    public static boolean hasTeen(int num0, int num1, int num2) {
        int[] array = {num0,num1,num2};

        for (int i=0; i<array.length; i++) {
            if (array[i] >= 13 || array[i] <= 19) {
                return true;
            }
        }
        return false;
    }
}
