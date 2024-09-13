package weekTwo.Lab2;

import java.util.Scanner;

public class ScannerRectanglePerimiter {
    public static void main(String[] args) {
        double length,width;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        length = Double.parseDouble(scn.nextLine());
        System.out.println("Enter the width of side 2: ");
        width = Double.parseDouble(scn.nextLine());

        double area = ((length * 2) + (width * 2));
        System.out.printf("The perimeter of the rectangle is %.1f",area);
    }
}
