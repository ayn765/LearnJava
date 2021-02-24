package myPrograms;

public class EncapsulationPractice {

    private String plantName;
    private String plantType;
    private String color;
    boolean westFlowerBed;
    boolean eastFlowerBed;


    public void sunbathing(){
        System.out.println("getting sun");
    }
    public void gettingWatered(){
        System.out.println("getting watered");
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public EncapsulationPractice(String plantName){
        this.plantName = plantName;
        System.out.println("A plant " + plantName+ " is created");
    }

}
