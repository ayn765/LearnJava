package package2;

public class MethodPractice {

    static int a = 10;
    static int b = 25;

    //access modifier          //return statement     //Method code block opening
    public            static         void            main(String[] args) { //method signature

    /*
    ACCESS MODIFIER
     */
    //public - accessible in all packages and classes, Global access
    //protected - accessible within the same package
    //private - accessible within the same class


    /*
    RETURN TYPE
     */
    //2 different types of methods
        // 1- Method that performs an action (void)
        // 2- Method that returns a value (int, double, String, float, etc)

//        MethodPractice sample = new MethodPractice();
        System.out.println(addition());

    }//Method code block closing

    public static int addition(){

        int z = getNumberA() + getNumberB();
        return z;
    }

    public static double division(){
        int c = 0;

        return c;
    }
    public static int getNumberA(){
        return a;
    }
    public static int getNumberB(){
        return b;
    }
}

