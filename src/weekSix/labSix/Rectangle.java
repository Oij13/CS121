package weekSix.labSix;
import java.util.Scanner;
public class Rectangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double length, width, area;
        length = getLength();
        width = getWidth();
        area = getArea(length, width);

        displayData(length, width, area);

        scanner.close();
    }
    public static double getLength(){
        System.out.println("Enter the length of a rectangle:");
        double length = Double.parseDouble(scanner.nextLine());
        return length;
    }
    public static double getWidth(){
        System.out.println("Enter the width of a rectangle:");
        double width = Double.parseDouble(scanner.nextLine());
        return width;
    }
    public static double getArea(double length,double width){
        double area = length * width;
        return area;
    }
    public static void displayData(double length, double width, double area){
        System.out.println("This is the data for the rectangle: ");
        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The width is: " + area);
    }
}
