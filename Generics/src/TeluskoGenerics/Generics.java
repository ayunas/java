package TeluskoGenerics;


class NumberContainer<T extends Number> {
    T value;

    NumberContainer(T val) {
        this.value = val;
    }

}



class Container<T> {
    T value;
    static int num;

    Container() {
        System.out.println("default constructor");
    }

    Container(T val) {
        this.value = val;
    }

    void show() {
        System.out.println(value.getClass().getName());
        System.out.println(this.value + "\n===================");
    }
}

class Generics {

    public static void main(String[] args) {

        Container<?> obj = new Container<>();
        Container<Integer> obj2 = new Container<>();
        obj2.value = 20;
        Container.num = 50;
        System.out.println(Container.num);
        obj2.show();

        Container<String> obj3 = new Container<>("fortitude");
        obj3.show();

        Container<Double> obj4 = new Container<>(25.25);
        obj4.show();

        Container<Integer> int1 = new Container<>(20);
        int1.show();

        Container<Long> long1 = new Container<>(25L);
        long1.show();

        Generics gen = new Generics();
        Container<Generics> gencont = new Container<>(gen);
        gencont.show();



    }

}

