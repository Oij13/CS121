package weekSeven;

public class Student {
    String studentClass;
    String classTeacher;
    int studentClassID;

    public Student(){

    }

    public Student(String Class, int ClassID, String Teacher) {
        this.studentClass = Class;
        this.classTeacher = Teacher;
        this.studentClassID = ClassID;
    }

    public void displayStudentInfo(){
        System.out.printf("The Class the Student is taking: %s\nClass ID: %d\nClass Teacher: %s\n",this.studentClass,this.studentClassID,this.classTeacher);
    }
}
