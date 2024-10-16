package weekNine;
import java.sql.SQLOutput;
import java.util.Random;

public class GymScheduling {
    private String name;
    private int age;
    private String course;
    private int id;
    private int conNum;
    private String memType;

    Random rand = new Random();

    public GymScheduling(){
    }

    public GymScheduling(int userId){
        this.id = userId;

    }
    public GymScheduling(String userName, int userAge, String gymCourse, String membership){
        this.name = userName;
        this.age = userAge;
        this.course = gymCourse;
        this.memType = membership;
    }

    public void displayUser(){
        conNum = rand.nextInt(1000, 9000);
        System.out.printf("Thank you for booking your class at FitLife Gym!" +
                "\nName: %s\nAge: %d\nClass: %s\nConfirmation Number: %d\n",
                name,age,course,conNum);
    }
    public void displayMember(){
        conNum = rand.nextInt(1000, 9000);
        System.out.println("Thank you for booking your class at FitLife Gym!" +
                "\nMember ID: "+ id + "\nClass: " + course + "\nConfirmation Number: " + conNum);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setConNum(int conNum){
        this.conNum = conNum;
    }
    public int getConNum(){
        return conNum;
    }

    public void setMemType(String memType){
        this.course = memType;
    }
    public String getMemType(){
        return memType;
    }
}
