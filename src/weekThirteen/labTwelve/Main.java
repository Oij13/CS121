package weekThirteen.labTwelve;

public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();

        ds.addStudent("Susan");
        ds.addStudent(5);
        ds.addStudent(6.7);
        ds.printStudents();
        ds.removeStudent();
        ds.printStudents();

        ds.addAge(30);
        ds.addAge("50");
        ds.addAge("sad");
        ds.printArray();
        ds.removeAge();

        ds.addMajor("CS",3.8);
        ds.addMajor(345,"string");
        ds.addMajor(43.2,"Cyber");
        ds.printMajorGPA();
        ds.removeMajor(43.2);
        ds.printMajorGPA();

        ds.addNationality("American");
        ds.addNationality(2345);
        ds.addNationality(234.2);
        ds.printNationality();
        ds.removeNationality();
        ds.printNationality();

        ds.addHomeState(50);
        ds.addHomeState("Georgia");
        ds.addHomeState(34.5);
        ds.printState();
        ds.removeState();
        ds.printState();

        ds.addHometown(2345);
        ds.addHometown("Fort Wayne");
        ds.addHometown(543.6);
        ds.printTown();
        ds.removeTown();
        ds.printTown();
    }
}
