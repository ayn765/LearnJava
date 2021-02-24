package practice;

import java.util.ArrayList;

public class ArrayListEgg {

    public static void main(String[] args) {

        ArrayList<String> myList= new ArrayList<String>();
        String firstPiece = "one";
        myList.add(firstPiece);
        String secondPiece = "two";
        myList.add(secondPiece);

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        int x = myList.indexOf(secondPiece);
        System.out.println(x);
        myList.remove(firstPiece);
    }
}
