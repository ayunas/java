package GenericsChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class League<T> {

    ArrayList<String> sports = new ArrayList<>();


    void addTeam(T team) {
        this.sports.add(team);
    }

    void showLeague() {
        System.out.println(this.sports);
    }

    ArrayList getLeague() {
        return this.sports;
    }
}

class Show {
    public static void main(String[] args) {
        League league = new League();
        league.addTeam("NY Knicks");
        league.showLeague();

    }
}
