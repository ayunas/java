package jobreadyprogrammer;

public class Practice {

    public static void main(String[] args) {
        FuncInt lambdaHi = () -> System.out.println("lambda hello there");
        lambdaHi.abstractMethod();

        Calculate summer = (a,b) -> a + b;
        System.out.println(summer.calc(3,4));

        Calculate lambdaNonZeroDivider = (a,b) -> {
            if(b == 0) return 0;
            return (int) a / b;
        };

        int x = lambdaNonZeroDivider.calc(20,10);
        System.out.println(x);

        Practice p = new Practice();
        System.out.println(p.reverse("hello"));

       Stringable lambdaReverse = (str) -> {
             String result = "";
             for(int i=str.length()-1; i>=0; i--) {
                 result = result + str.charAt(i);
             }
             return result;
         };

        String reversed = lambdaReverse.perform("doggy");
        System.out.println(reversed);

        System.out.println(p.factorial(4));

        Factorable lambdaFact = (n) -> {
            int product = 1;
            for(int i=1; i<=n; i++) {
                product *= i;
            }
            return product;
        };

        System.out.println("lambda factorial : " + lambdaFact.calc(4));

        Oneable<String> reversey = s -> {
            String result = "";
            for(int i=s.length()-1; i>=0; i--) {
                result += s.charAt(i);
            }
            return result;
        };

        System.out.println(reversey.work("noob saibot"));
    }

    void sayHello() {
        System.out.println("hello there");
    }

    int sum(int a, int b) {
        return a + b;
    }

    int nonZeroDivide(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }

    String reverse(String str) {
        String result = "";
        for(int i=str.length()-1; i>=0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    int factorial(int num) {
        int product = 1;
        for(int i=1; i<=num; i++) {
            product *= i;
        }
        return product;
    }
}

interface Calculate {
    int calc(int a,int b);
}

interface Factorable {
    int calc(int n);
}


interface Stringable {
    String perform(String s);
}

interface Oneable<T> { //generic functional interface to input and output 1 data type.
    T work(T t);
}

