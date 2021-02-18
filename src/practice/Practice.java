package practice;

public class Practice {
    public static void main(String[] args) {
        whilePractice();
        exercise1B();
        exersice2B();
    }

    public static void whilePractice(){
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }
    public static void exercise1B(){
        int x = 1;
        while (x < 10){
            x = x + 1;
            if (x < 3){
                System.out.println("big x");
            }
        }
    }
    public static void exersice2B(){
        int x = 5;
        while (x > 1){
            x = x - 1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }
}
