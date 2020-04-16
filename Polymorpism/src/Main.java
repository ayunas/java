//

public class Main {  //to run in plain terminal, the Main class must be first class .  otherwise, tries to run another class, main method missing error.

    public static void main(String[] args) {

        for (int i=0; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie name: " + movie.name + "\nplot: " + movie.plot() + "\n");
        }




    }

        static Movie randomMovie() {
            int choice = (int) (Math.random()*5);

            switch(choice) {
                case 1:
                    return new Jaws("jaws");
                case 2:
                    return new IndependenceDay("independence day");
                case 3:
                    return new BeautifulMind("beautiful mind");
                case 4:
                    return new StarWars("return of the jedi");
                case 5:
                    return new Daddy("daddy");
                default:
                    return new Movie("unknown");
            }




        }
}

class Movie {
    String name;

    Movie(String name) {
        this.name = name;
    }

    static String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {

    Jaws(String name) {
        super(name);
    }


    String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    IndependenceDay(String name) {
        super(name);
    }

    @Override
    String plot() {
        return "Aliens try to take over Earth";
    }
}

class BeautifulMind extends Movie {
    BeautifulMind(String name) {
        super(name);
    }

    String plot() {
        return "A brilliant mathematician struggles with Schitzophrenia";
    }
}

class StarWars extends Movie {
    StarWars(String name) {
        super(name);
    }

    String plot() {
        return "The imperial empire tries to take over the universe.  the Jedi fight back using the force.";
    }
}

class Daddy extends Movie {
    Daddy(String name) {
        super(name);
    }
}


