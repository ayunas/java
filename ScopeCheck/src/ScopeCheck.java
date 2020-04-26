public class ScopeCheck {
    public int publicVar = 0;
    private static int privateVar = 1;

    public ScopeCheck() {
        System.out.println("Scopecheck created.  publicvar = " + publicVar + " privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public static void main(String[] args) {
        ScopeCheck sc = new ScopeCheck();
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + "times two is " + i * privateVar);
        }
    }

}
