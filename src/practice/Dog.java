package practice;

public class Dog {
    String name;
    void bark(){
        System.out.println(name + " says Ruff");
    }
    void eat(){
        System.out.println("eating");
    }
    void chaseCat(){
        System.out.println("chasing cats");
    }


    public static void main(String[] args) {
        //make dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //now making a dog array
        Dog[] myDogs = new Dog[3];
        //and putting some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //accessing dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //hmmm... what about myDogs[2] name?
        System.out.println("last dog's name is " + myDogs[2].name);

        //now looping through the array and telling all dogs bark
        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
