package package2;

public class ConstructorConcept {

    //constructor doesn't return any value
    //default constructor has no parameters

    public ConstructorConcept(){
        System.out.println("Default constructor");
    }
    //parametrized constructor
    public ConstructorConcept(int i){
        System.out.println("Single parameter constructor");
        System.out.println("the value of i: " + i);
    }
    //constructor overloading:
    public ConstructorConcept(int i, int j){
        System.out.println("two parameters constructor");
        System.out.println("the value of i: " + i);
        System.out.println("the value of J: " + j);
    }
    //Q: how to call a constructor?
    //A: Constructor is call immediately after creating an object

    public static void main(String[] args) {
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10);
        ConstructorConcept obj2 = new ConstructorConcept(15, 20);
    }

}
