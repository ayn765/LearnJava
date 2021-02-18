package practice;

public class Cat {
    String name;
    String call = "Meow!";
    int numOfMeow = 10;

    void meow(int numOfMeow) {

            if (numOfMeow > 10) {
                System.out.println("Can somebody throw a newspaper at this cat?");
            }else if (numOfMeow > 3) {
                System.out.println("We got your point, Cat!");
            }else if (numOfMeow == 0) {
                System.out.println("This cats doesn't want to talk");
            }
        while (numOfMeow > 0){
            System.out.print(call);
            numOfMeow = numOfMeow - 1;
        }
    }
}
