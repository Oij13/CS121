package weekThirteen.setAndIteratorActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GymSet gymSet = new GymSet();
        Scanner scn = new Scanner(System.in);
        System.out.println("*********Gym Scheduled Classes System*********");
        while (true){
            System.out.println("Option 1: Add a gym class\nOption 2: View scheduled classes\nOption 3: Exit the system");
            int choice = Integer.parseInt(scn.nextLine());
            if (choice == 1) {
                gymSet.addTables();
            } else if (choice == 2) {
                gymSet.displayTables();
            } else if (choice == 3) {
                System.out.println("Exiting System!");
                return;
            }
        }
    }
}
