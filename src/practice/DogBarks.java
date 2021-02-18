package practice;

public class DogBarks {
    int size;

    String name;

    void bark(){
        if (size > 60){
            System.out.println("Woof! Woof!");
        }else if (size > 14){
            System.out.println("Ruf! Ruf!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }
}
