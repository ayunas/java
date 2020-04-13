public class For {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i=1; i<1001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
            }

            if (count >= 5) break;
        }

        System.out.println(sum);
        System.out.println(count);

    }
}

//public class Obj {
//
//    public void Obj(name,age) {
//        this.name = "amir";
//        this.age = "38";
//    }
//
//    public static void main(String[] args) {
//        Obj obj = new Obj("amir", 38);
//    }
//}
