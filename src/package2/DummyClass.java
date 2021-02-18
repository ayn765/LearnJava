package package2;

import java.sql.SQLOutput;

public class DummyClass {

    //for non-static variables/methods, you MUST create an object of that class, in order to call it from static method
    //for static variables/methods , you do not to create an object. They can be called referencing the class name.

    public static void main(String[] args) {


        //Creating an object of class Phone
        //declaration  //initialization
        Phone iPhone = new Phone();


        //Static variables are shared variables for all the objects of the class

        iPhone.color = "blue";
        iPhone.size = 10.6;
        iPhone.memory = 512;
        iPhone.manufacturer = "Apple";
        iPhone.isSmartPhone = true;

//        System.out.println(iPhone.color);

        iPhone.makeCall();
        iPhone.takePicture();
        iPhone.sendText();

    }
}