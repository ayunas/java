package jobreadyprogrammer;

public class App<A> {

    public static void main(String[] args) {
        Human tom = new Human();
        Robot r2 = new Robot();
        walky(tom);
        walky(r2);

        walky(new Walkable() {
            @Override
            public void walk() {
                System.out.println("custom object walking");
            }
        });

        walky(() -> System.out.println("custom object 2 walking"));

        walky(() -> {
            System.out.println("walky1");
            System.out.println("walky2");
        });

        Walkable lambdawalk = () -> System.out.println("lambda walks");
        walky(lambdawalk);
    }

    static void walky(Walkable walker) {
        walker.walk();
    }
}
