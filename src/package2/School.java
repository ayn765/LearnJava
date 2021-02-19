package package2;

public class School {

    String name;
    String sex;
    private int grade;
    private int age;
    String subject;
    String teacher;
    public School (String schoolName){
        System.out.println("This Enrollment is for " + schoolName + " students.");
    }

    public void setAge(int age){
        this.age = age;
        System.out.println(name + " is " + age + " years old.");
    }
    public int getAge(){
        return age;
    }
    public int assignGrade(){
        getAge();
        if ((age >= 4) || (age == 6)){
            int grade = 1;
            System.out.println(name + " is in 1st grade.");
        }
        else if((age > 6) || (age == 8)){
            int grade = 2;
            System.out.println(name + " is in 2nd grade.");
        }else{
            System.out.println(name + " is not qualified for elementary school");
        }
        return grade;
    }
}
