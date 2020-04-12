public class Main {
    public static void main(String[] args) {
        calcScore(5);
        calcScore(6,4,3);
        calcScore();
    }

    public static int calcScore(int num) {
        return num * 1000;
    }

    public static int calcScore() {
        System.out.println("calcscore with no parameters");
        return 25;
    }

    public static int calcScore(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
        return (n1 + n2 + n3);
    }

//    public static void calcScore() {
//
//    }

}
