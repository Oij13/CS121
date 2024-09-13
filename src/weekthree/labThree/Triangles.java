package weekthree.labThree;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer side1, side2, side3;

        System.out.println("Enter the value of side 1.");
        side1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the value of side 2.");
        side2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the value of side 3.");
        side3 = Integer.parseInt(scanner.nextLine());

        if ((side1 == side2) && (side2 == side3)){
            System.out.println("This triangle is an equilateral");
        }
        else if ((side1 != side2) && (side2 != side3) && (side1 != side3)){
            System.out.println("This triangle is a scalene");
        }
        else {
            System.out.println("This triangle is a Isosceles");
        }
    }
}
