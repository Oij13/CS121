package weekSeven;

public class TestClass {
    public static void main(String[] args) {


        Student student1 = new Student("CS121",121, "Ladelle");

        student1.displayStudentInfo();

        Teacher teacher1 = new Teacher("Ladelle","CS121", 123456);

        teacher1.displayTeacherInfo();
    }

}
