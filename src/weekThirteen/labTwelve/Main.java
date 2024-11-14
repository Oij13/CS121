package weekThirteen.labTwelve;

public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();

        ds.addStudent("Susan");
        ds.addStudent("Susan");
        ds.addStudent("Susan");
        ds.printStudents();
        ds.removeStudent();
        ds.printStudents();

        ds.addAge(30);
        ds.addAge(50);
        ds.addAge(40);
        ds.printArray();
        ds.removeAge();

        ds.addMajor("CS",3.8);
        ds.addMajor("Cybersecurity",3.8);
        ds.addMajor("Sport Ad",3.5);
        ds.printMajorGPA();
        ds.removeMajor("Cybersecurity");
        ds.printMajorGPA();

        ds.addNationality("American");
        ds.addNationality("English");
        ds.addNationality("German");
        ds.printNationality();
        ds.removeNationality();
        ds.printNationality();

        ds.addHomeState("Indiana");
        ds.addHomeState("Georgia");
        ds.addHomeState("Alabama");
        ds.printState();
        ds.removeState();
        ds.printState();

        ds.addHometown("Decatur");
        ds.addHometown("Fort Wayne");
        ds.addHometown("Geneva");
        ds.printTown();
        ds.removeTown();
        ds.printTown();
    }
}
