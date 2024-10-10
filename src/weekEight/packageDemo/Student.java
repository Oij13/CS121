package weekEight.packageDemo;

public class Student {

    private String studentName;
    private String major;
    private int studentId;
    private int year;
    private double gpa;


    public Student(String Name, String Major, int ID, int Year, double GPA){
        this.studentName = Name;
        this.major = Major;
        this.studentId = ID;
        this.year = Year;
        this.gpa = GPA;
    }

    public void setStudentName(String Name){
        this.studentName = studentName;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setYear(int Year){
        this.year = year;
    }
    public void setGPA(double GPA){
        this.gpa = gpa;
    }

    public String getStudentName(){
        return studentName;
    }
    public String getMajor(){
        return major;
    }
    public int getStudentID(){
        return studentId;
    }
    public int getYear(){
        return year;
    }
    public double getGpa(){
        return gpa;
    }
}
