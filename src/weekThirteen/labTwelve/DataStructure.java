package weekThirteen.labTwelve;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private int ageIndex = 0;
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    //ADDING ITEMS
    public void addStudent(String name){
        studentList.add(name);
    }
    public void addAge(int age){
        if(ageIndex < ageList.length) {
            ageList[ageIndex ++] = age;
        }
    }
    public void addMajor(String major,Double gpa){
        majorGpaMap.put(major,gpa);
    }
    public void addNationality(String nationality){
        nationalityList.add(nationality);
    }
    public void addHometown(String town){
        hometownStack.add(town);
    }
    public void addHomeState(String state){
        homeStateQueue.add(state);
    }

    //REMOVING ITEMS
    public void removeStudent(){
        studentList.removeLast();
    }
    public void removeAge(){
        if(ageIndex > 0){
            ageList[--ageIndex] = 0;
        }
    }
    public void removeMajor(String major){
        majorGpaMap.remove(major);
    }
    public void removeNationality(){
        nationalityList.removeLast();
    }
    public void removeTown(){
        hometownStack.pop();
    }
    public void removeState(){
        homeStateQueue.poll();
    }

    //DISPLAY ITEMS
    public void printStudents(){
        System.out.println("\nStudents:");
        for (String student : studentList){
            System.out.println(student);
        }
    }
    public void printArray(){
        System.out.println("\nArrays: ");
        System.out.println("The Content in the array: ");
        for (int i = 0; i < ageList.length; i++){
            System.out.printf("\t%d\n",ageList[i]);
        }
    }
    public void printMajorGPA(){
        System.out.println("\nMajor and GPA:");
        for (String major : majorGpaMap.keySet()){
            System.out.println("Major: " + major + "\nGPA: " + majorGpaMap.get(major));
        }
    }
    public void printNationality(){
        System.out.println("\nNationality: ");
        for (String nationality : nationalityList){
            System.out.println(nationality);
        }
    }
    public void printTown(){
        System.out.println("\nHome Town Stack: ");
        for (String town : hometownStack)
            System.out.println(town);
    }
    public void printState(){
        System.out.println("\nHome State Queue: ");
        for (String state : homeStateQueue){
            System.out.println(state);
        }
    }
}
