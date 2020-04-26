public class Private {
    public int num1 = 10;
    private int num2 = 20;

    public static void main(String[] args) {
        Private p = new Private();
        System.out.println(p.num1);
        System.out.println(p.num2);
    }

    public int getNum2() {
        return this.num2;
    }
}




