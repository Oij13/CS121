package weekThirteen.labTwelve;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//To allow methods to operate with different types. They allow programmers to utilize methods more broadly across multiple types of objects.
//You can use generic methods to one method to take in all kinds of variables. A generic method could take in both arrays or a linked list.
//Generic methods are not well-supported, limiting their potential. A pro is that they allow you to reuse code when types change throughout your program.

public class DataStructure <T>{
    private final ArrayList<T> studentList = new ArrayList<>();
    private final T [] ageList;
    final private int SIZES = 10;
    private int ageIndex = 0;
    private final HashMap<T, T> majorGpaMap = new HashMap<>();
    private final LinkedList<T> nationalityList = new LinkedList<>();
    private final Stack<T> hometownStack = new Stack<>();
    private final Queue<T> homeStateQueue = new LinkedList<>();

    public DataStructure() {
        ageList = (T[]) new Object[SIZES];
    }

    //ADDING ITEMS
    public void addStudent(T name){
        studentList.add(name);
    }
    public void addAge(T age){
        if(ageIndex < ageList.length) {
            ageList[ageIndex ++] = age;
        }
    }
    public void addMajor(T major,T gpa){
        majorGpaMap.put(major,gpa);
    }
    public void addNationality(T nationality){
        nationalityList.add(nationality);
    }
    public void addHometown(T town){
        hometownStack.add(town);
    }
    public void addHomeState(T state){
        homeStateQueue.add(state);
    }

    //REMOVING ITEMS
    public void removeStudent(){
        studentList.removeLast();
    }
    public void removeAge(){
        if(ageIndex > 0){
            ageList[--ageIndex] = null;
        }
    }
    public void removeMajor(T major){
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
        for (T student : studentList){
            System.out.println(student);
        }
    }
    public <T> void printArray(){
        System.out.println("\nArrays: ");
        System.out.println("The Content in the array: ");
        for (int i = 0; i < ageList.length; i++){
            System.out.println("\t"+ ageList[i] +"\n");
        }
    }
    public void printMajorGPA(){
        System.out.println("\nMajor and GPA:");
        for (T major : majorGpaMap.keySet()){
            System.out.println("Major: " + major + "\nGPA: " + majorGpaMap.get(major));
        }
    }
    public void printNationality(){
        System.out.println("\nNationality: ");
        for (T nationality : nationalityList){
            System.out.println(nationality);
        }
    }
    public void printTown(){
        System.out.println("\nHome Town Stack: ");
        for (T town : hometownStack)
            System.out.println(town);
    }
    public  void printState(){
        System.out.println("\nHome State Queue: ");
        for (T state : homeStateQueue){
            System.out.println(state);
        }
    }
}
