package package2;

public class SchoolInAction {

    public static void main(String[] args) {


        School child1 = new School("Algonkian Elementary");
        child1.name = "John";
        child1.sex = "boy";
        System.out.println(child1.name + " is a " + child1.sex);
        child1.setAge(5);
        child1.assignGrade();


    }
}
