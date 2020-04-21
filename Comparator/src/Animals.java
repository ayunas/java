import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Animals implements Comparable {
    int animalWeight;
    String animalName;

    Animals(String name, int weight) {
        this.animalName = name;
        this.animalWeight = weight;
    }

    @Override
    public int compareTo(Object o) {
        return this.getAnimalWeight() - ((Animals) o).getAnimalWeight();
    }

    int getAnimalWeight() {
        return this.animalWeight;
    }
}

class Donkey extends Animals {

    Donkey(String name, int weight) {
        super(name, weight);
    }

    void bray() {
        System.out.println("إن أنكر الأصواب لصوت الحمير");
    }

    public static void main(String[] args) {
        Donkey eeyore = new Donkey("Eyor",100);
        Donkey dunkey = new Donkey("Dunkin'", 150);
        Donkey gus = new Donkey("Gus", 75);
        Donkey benjamin = new Donkey("Benjamin",125);
        ArrayList<Donkey> donkeys = new ArrayList<>();
        donkeys.addAll(Arrays.asList(eeyore,dunkey,gus,benjamin));

//
//        donkeys.forEach(d -> System.out.println(d.animalName));
//
//        Collections.sort(donkeys,Animals::compareTo);
//        System.out.println("\n=====================");
//
//        donkeys.forEach(d -> System.out.println(d.animalName));

        donkeys.forEach(d -> System.out.println(d.animalName + " : " + d.animalWeight));

        Comparator byWeight = Comparator.comparing(Animals::getAnimalWeight);
        Collections.sort(donkeys,byWeight);

        System.out.println("\n=====================");
        donkeys.forEach(d -> System.out.println(d.animalName + " : " + d.animalWeight));
    }
}


