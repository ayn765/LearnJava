package practice;

public class DogBarksTestDrive {
    public static void main(String[] args) {

        DogBarks one = new DogBarks();
        one.size = 70;
        DogBarks two = new DogBarks();
        two.size = 8;
        DogBarks three = new DogBarks();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
