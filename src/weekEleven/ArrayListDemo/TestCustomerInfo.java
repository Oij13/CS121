package weekEleven.ArrayListDemo;

import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
    SystemManagement demo = new SystemManagement();
    Scanner scanner = new Scanner(System.in);

    demo.addScore(88);
    demo.addScore(97);
    demo.addScore(94);

    demo.addLetter("B");
    demo.addLetter("A");
    demo.addLetter("A");

    demo.addGPA(3.5);
    demo.addGPA(3.8);
    demo.addGPA(3.7);
    while(true){
        String score = scanner.nextLine();
        if (score.equals("q")) {
        demo.displayInfo();
        }
    }

    }
}
