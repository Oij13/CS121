package weekTwo;

import java.util.Scanner;

public class BookClubPoints {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of books purchased: ");
        int books,points = 0;
        books = Integer.parseInt(scn.nextLine());
        //points = Integer.parseInt(scn.nextLine());
        if (books <= 0) {
            points = 0;
        }
        else if (books == 1) {
            points = 5;
        }
        else if (books == 2) {
            points = 15;
        }
        else if (books ==3 ) {
            points = 30;
        }
        else if (books >= 4) {
            points = 60;
        }
        else {
            System.out.println("Invalid input!");
        }
        System.out.printf("You scored %d points",points);
        scn.close();

    }
}
