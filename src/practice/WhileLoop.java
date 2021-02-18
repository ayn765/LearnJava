package practice;

public class WhileLoop {
    //while loop runs everything within its block as long as the condition test is true
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while (x<4){ //boolean test inside parenthesis
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x=x+1;
        }
        System.out.println("This is after the loop");


    }
}
