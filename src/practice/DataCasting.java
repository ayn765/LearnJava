package practice;

import java.sql.SQLOutput;

public class DataCasting {

    //assigning smaller data type variable to larger data type is know as implicit or widening type casting
    // and performed by the compiler. There is no data loss.
    static int x = 5;
    static double y = x;

    //assigning larger data type variable to a smaller data type variable is known as explicit type casting or narrowing
    // and requires brackets for smaller data type. There is data loss.
    static float a = 56.2615f;
    static byte b = (byte) a;

    //assigning a non-primitive data type variables require a wrapper class
    static String age = "3";
    static int z = 5;
    static int ageConv = Integer.parseInt(age);
    static float ageConvF = Float.parseFloat(age);
    static String five = String.valueOf(z);


    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);

        System.out.println(a);
        System.out.println(b);

        System.out.println(age);
        System.out.println(ageConv);
        System.out.println(ageConvF);
        System.out.println(five);
    }
}
