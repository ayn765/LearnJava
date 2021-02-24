package package2;

public class StaticNonStaticConcept {

    //global variables: the scope of global vars will be available across all the functions with some conditions(static/non-static)
    String name = "Tom"; //non-static global variable
    static int age = 25; // static global variable

    public static void main(String[] args) {

        //how to call static methods and variables?
        //1. direct calling:
        sum();
        System.out.println(age);
        //2. by calling Class Name:
        StaticNonStaticConcept.sum();
        System.out.println(StaticNonStaticConcept.age);

        //how to call non-static methods/variables:
        //1. by object reference:
        StaticNonStaticConcept obj = new StaticNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);


    }
    public void sendMail(){ //non-static method
        System.out.println("Send mail method");

    }
    public static void sum(){
        System.out.println("Sum method");
    }
}
