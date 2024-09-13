package weekTwo;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int test1,test2,test3;
        String grade ;

        System.out.println("Enter your first test score: ");
        test1 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter your second test score: ");
        test2 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter your third test score: ");
        test3 = Integer.parseInt(scn.nextLine());

        double avg;
        avg = (test1 + test2 + test3) / 3;
        System.out.printf("The average of your scores is %f", avg);

        if (avg < 60) {
            grade = "F";
        }
        else if (avg <= 69) {
            grade = "D";
        }
        else if (avg <= 79) {
            grade = "C";
        }
        else if (avg <= 89 ) {
            grade = "B";
        }
        else if (avg <= 100) {
            grade = "A";
        }
        else {
            System.out.println(" Invalid input!");
            grade = "N/A";
        }
        System.out.printf("You got a letter grade of %s",grade);
        scn.close();

    }
}
