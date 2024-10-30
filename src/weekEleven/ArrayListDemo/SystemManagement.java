package weekEleven.ArrayListDemo;
import java.util.ArrayList;

public class SystemManagement {
    private ArrayList<Integer> scoreList = new ArrayList<>();
    private ArrayList<String> letterList = new ArrayList<>();
    private ArrayList<Double> gpaList = new ArrayList<>();

    public void addScore(int score){
        scoreList.add(score);
    }
    public void removeScore(int score){
        scoreList.remove(score);
    }
    public int getScore(int index){
        return scoreList.get(index);
    }
    public int getSizeOfScore(){
        return scoreList.size();
    }

    public void addLetter(String letter){
        letterList.add(letter);
    }
    public void removeLetter(String letter){
        letterList.remove(letter);
    }
    public String getLetter(int index){
        return letterList.get(index);
    }
    public int getSizeOfLetter(){
        return letterList.size();
    }

    public void addGPA(double gpa){
        gpaList.add(gpa);
    }
    public void removeGPA(double gpa){
        gpaList.remove(gpa);
    }
    public double getGPA(int index){
        return gpaList.get(index);
    }
    public int getSizeOfGPA(){
        return gpaList.size();
    }

    public void displayInfo(){
        System.out.printf("Scores:\n");
        for (int score : scoreList){
            System.out.println(score);
        }
        System.out.printf("Letter Grade:\n");
        for (String letter : letterList){
            System.out.println(letter);
        }
        System.out.printf("GPA:\n");
        for (double gpa : gpaList){
            System.out.println(gpa);
        }
    }


}
