package weekEight.packageDemo;

public class StudentTest {
    public static void main(String[] args) {
        Student studentOne = new Student("Jane", "CS", 999999, 2024, 3.6);

        System.out.println("Student Name: " + studentOne.getStudentName());
        System.out.println("Major: " + studentOne.getMajor());
        System.out.println("Student ID: " + studentOne.getStudentID());
        System.out.println("Year: " + studentOne.getYear());
        System.out.println("GPA: " + studentOne.getGpa());


        studentOne.setMajor("Construction");
        studentOne.setGPA(3.9);

        System.out.println("\nMajor: " + studentOne.getMajor());
        System.out.println("GPA: " + studentOne.getGpa());
    }
}
