package practice;

public class Subtraction {
    int a = 15;
    int b = 10;

    int sum(int a, int b){
        int z = a + b;
        return z;
    }
    public static void main(String[] args) {

        Subtraction problem1 = new Subtraction();
        int answer = problem1.sum(8, 9);
        System.out.println("The answer to this problem is " + answer);
    }
}
