package package2;

public class StaticPractice {

    static String name = "Alexandra";

    //Static variables/methods can be called from static or non-static methods
    //Non-static variables/methods CANNOT be called from static method

    public static void main(String[] args) {

        System.out.println("main() method:" + name);

        String name = printName();
        System.out.println("printName() method: " + name);

//Storing value of return method in a variable
        int product = multiplication();
        System.out.println(product);

    }

    public static String printName(){
        return name;
    }

    public static int multiplication(){
        int x = 10;
        int y= 1000;
        int z = x * y;
        return z;

    }




}
