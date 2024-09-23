package weekFour;
import javax.swing.*;
import java.util.*;

public class TestAverage {
    public static void main(String[] args) {
        int students,num_Tests;

        students = Integer.parseInt(JOptionPane.showInputDialog("Enter number of students: "));
        num_Tests = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tests: "));

        for (int i = 1; i <= num_Tests; i++){
            int score_1,score_2,score_3;
            score_1=Integer.parseInt(JOptionPane.showInputDialog("Enter score 1: "));
            score_2=Integer.parseInt(JOptionPane.showInputDialog("Enter score 2: "));
            score_3=Integer.parseInt(JOptionPane.showInputDialog("Enter score 3: "));
            double total = ((score_1 + score_2 + score_3)/3);
            System.out.printf("The average for student %d is %.2f \n",i,total);

        }

    }
}