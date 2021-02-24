package package2;

public class A {
    public A(){
        System.out.println("parent class constructor");
    }
    public A(int i){
        System.out.println("value of i: " + i);
    }
    public A(int i, int j){
        System.out.println("value of i: " + i);
        System.out.println("value of j: " + j);
    }
}
