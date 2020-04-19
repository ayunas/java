import java.util.Arrays;

interface Animal {
    void animalSound();
    void sleep();
}

interface Living {
    void breathe();
    void heartBeat();
    public static int modfree = 100;
    public int modP=100;
    public static final int modPSF = 100;
    //all variable declarations are treated the same in this interface.
}


public class Dog implements Animal,Living {

    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.animalSound();
        doggy.sleep();
        doggy.animalSound();
        doggy.breathe();
        doggy.heartBeat();
        int[] nums = {modfree,modP,modPSF,doggy.modfree, doggy.modP, doggy.modPSF};
        System.out.println(Arrays.toString(nums));
    }



    @Override
    public void animalSound() {
        System.out.println("bow wow wow yippy yo yippy yay");
    }

    @Override
    public void sleep() {
        System.out.println("doggy nappy");
    }

    @Override
    public void breathe() {
        System.out.println("Doggy is panting...");
    }

    @Override
    public void heartBeat() {
        System.out.println("و بلغت القلوب الحناجر");
    }



}
