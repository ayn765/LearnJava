package package2;

public class B extends A {
    public B(){
        super();
        System.out.println("calling constructor from parent class with no parameters");
    }
    public B(int i){
        super(i);     //using keyword 'super' allows to call Parent Class constructor
        System.out.println("parent class constructor with one parameter");
    }
    public B(int i, int j){
        super(i, j);
        System.out.println("calling constructor form the parent class with two parameters");
    }

    public static void main(String[] args) {
        B obj = new B();  //child class constructor is being called upon creating an object
        B obj1 = new B(10);
        B obj2 = new B(15, 20);

    }

}
