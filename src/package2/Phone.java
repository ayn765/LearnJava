package package2;

public class Phone {

    //Class is a blueprint to create an object
    //Every class has 2 things:
    //1 - States
    //2 - Behaviours

        public String color = "blue";
        public String manufacturer;
        double size;
        int memory;
        boolean isSmartPhone;

    //Constructor - every class has a default constructor
    //Constructor helps construct/build an object of a class

    public Phone(){

    }

        public void makeCall(){
            System.out.println("Making a call");
        }
        public void sendText(){
            System.out.println("Send Text");
        }
        public void takePicture(){
            System.out.println("Taking picture");
        }
    }

