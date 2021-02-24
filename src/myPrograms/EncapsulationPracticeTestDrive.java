package myPrograms;

public class EncapsulationPracticeTestDrive {

    public static void main(String[] args) {
        EncapsulationPractice plant1 = new EncapsulationPractice("Rose");
        plant1.setColor("orange");
        String colorPlant1 = plant1.getColor();
        if(colorPlant1.equals("red")){
            boolean westFlowerbed = true;
            System.out.println("This rose is " + plant1.getColor() + ". It will be planted in the west flower bed.");
        }else{
            boolean eastFlowerbed = true;{
                System.out.println("This rose is " + plant1.getColor() + ". It will be planted in the east flower bed.");
            }
        }
    }
}
