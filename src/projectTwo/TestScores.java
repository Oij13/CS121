package projectTwo;

import java.util.Random;
import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);

        int SIZE = rand.nextInt(3,10);

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.printf("Number of test scores: %d\n",SIZE);

        for (int i = 0; i < SIZE; i++){
            System.out.println("Enter test score "+(i+1)+":");
            testScores[i] = scn.nextInt();
        }

        for (int i = 0; i < SIZE; i++){
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestSCore(testScores);
        printAverageScore(testScores);
    }
    public static char getLetterGrade(int score){
        if (score >=90) {
            return 'A';
        }
        else if (score >= 80){
            return 'B';
        }
        else if (score >= 70){
            return 'C';
        }
        else if (score >= 60){
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static void printGrades(int[] scores, char[] grades){
        System.out.printf("%-10s %-5s%n","Score","Grade");
        for (int i = 0; i < scores.length; i++){
            System.out.printf("%-10d %-5c%n", scores[i], grades[i]);
        }
    }
    public static void printHighestScore(int[] scores){
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest){
                highest = score;
            }
        }
        System.out.println("Highest Score: " + highest);
    }
    public static void printLowestSCore(int[] scores){
        int lowest = scores[0];
        for(int score : scores){
            if(score < lowest){
                lowest = score;
            }
        }
        System.out.println("Lowest Score: " + lowest);

    }
    public static void printAverageScore(int[] scores){

        int total = 0;
        for (int score: scores){
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.println("Average Score: " + average);
    }
}
