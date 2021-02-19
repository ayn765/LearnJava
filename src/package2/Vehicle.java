package package2;

public class Vehicle {
    private String typeOfVehicle = "car";
    String manufacturer;
    String model;
    int numOfWheels;

    public Vehicle(String typeOfVehicle){
        this.typeOfVehicle = typeOfVehicle;
    }

    public Vehicle(String typeOfVehicle, String manufacturer){
        this.typeOfVehicle = typeOfVehicle;
        System.out.println("This statement is declared in constructor");
    }

    public String getTypeOfVehicle(){
        this.typeOfVehicle = typeOfVehicle;
        return typeOfVehicle;
    }
}
