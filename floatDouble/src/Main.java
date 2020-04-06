public class Main {

    public static void main(String [] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("min float: " + minFloat);
        System.out.println("max float: " + maxFloat);
        System.out.println("\n");
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("min double: " + minDouble);
        System.out.println("max double: " + maxDouble);

        int int1 = 5;
        float float1 = 5f;
        double double1 = 5d;

        int int2 = 5;
        float float2 = 5;
        double double2 = 5;

        int int3 = (int) 5.25;
        float float3 = 5.25f;
        double double3 = 5.25;  //decimal number are doubles in java by default.

        System.out.println(int3);
        System.out.println(float3);
        System.out.println(double3);
        System.out.println("\n");
        int int4 = 5;
        float float4 = 5;
        double double4 = 5;

        System.out.println(int4);
        System.out.println(float4);
        System.out.println(double4);
        System.out.println("\n");
        
        int int5 = 5 / 2;
        float float5 = 5f / 2f;
        double double5 = 5d / 2d;

        System.out.println(int5);
        System.out.println(float5);
        System.out.println(double5);
        System.out.println("\n");

        int int6 = 5 / 3;
        float float6 = 5f / 3f;
        double double6 = 5d / 3d;

        System.out.println(int6);
        System.out.println(float6);
        System.out.println(double6);
        System.out.println("\n");
//        doubles are more precise, default for java, if decimnal # provided without literal suffix (d or f)





        
        
        






        
        
    }


}
