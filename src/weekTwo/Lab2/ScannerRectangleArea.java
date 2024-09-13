package weekTwo.Lab2;
import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args) {
        double length,width;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = Double.parseDouble(scn.nextLine());
        System.out.println("Enter the width: ");
        width = Double.parseDouble(scn.nextLine());

        double area = (length * width);
        System.out.printf("The area of the rectangle is %.1f",area);
    }
}
