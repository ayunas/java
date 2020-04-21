import java.util.*;

public class Player {
    int jersey;
    String name;
    String position;

    public Player(int jersey, String name, String position) {
        this.jersey = jersey;
        this.name = name;
        this.position = position;
    }

    int getJersey() {
        return this.jersey;
    }

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Player one = new Player(23,"Jordan","sg");
        Player two = new Player(1,"Penny", "pg");
        Player three = new Player(32,"magic","pg");
        Player four = new Player(32,"shaq","c");
        Player five = new Player(33,"bird","pg");

        players.addAll(Arrays.asList(one,two,three,four,five));

        players.forEach(p -> System.out.println(p.name));

        System.out.println(players);

        Comparator<Player> byJersey = Comparator.comparing(Player::getJersey);

        Collections.sort(players,byJersey);

        System.out.println(players);
        players.forEach(p -> System.out.println(p.name));
    }
}



