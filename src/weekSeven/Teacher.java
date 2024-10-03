package weekSeven;

public class Teacher {
    String teacherName;
    String teacherClass;
    int teacherID;


    public Teacher(String Name, String Class, int ID) {
        this.teacherName = Name;
        this.teacherClass = Class;
        this.teacherID = ID;
    }
    public void displayTeacherInfo() {
        System.out.printf("Teacher's Name: %s\nTeacher's Class: %s\nTeacher's ID: %d\n",this.teacherName,this.teacherClass,this.teacherID);
    }
}
