package JobReadyProgrammer;

public class IntegerContainer {

    Integer num1;
    Integer num2;

    IntegerContainer(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void printItems() {
        System.out.println("printing contents of " + this.num1.getClass().getName() + " container");
        int[] nums = {num1,num2};

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
