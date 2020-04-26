public class Main {
    static String privateVar = "this is private variable in the main method of the main class";

    public static void main(String[] args) {
        System.out.println(privateVar);
        ScopeCheck sc = new ScopeCheck();

    }
}
