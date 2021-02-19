package package2;

public class VehicleTestDrive {

    public static void main(String[] args) {

        Vehicle one = new Vehicle("boat");

        one.manufacturer = "Toyota";
        one.model = "Sienna";

        System.out.println("This type of Vehicle is " + one.getTypeOfVehicle());

        Vehicle two = new Vehicle("car", "Honda");
        two.numOfWheels = 4;
        System.out.println(two.getTypeOfVehicle());




    }
}