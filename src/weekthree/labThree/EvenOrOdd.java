package weekthree.labThree;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number;

        System.out.println("Enter a whole number: ");
        number = Integer.parseInt(scanner.nextLine());

        if ((number % 2) == 0){
            System.out.println("Your number is even.");
        }
        else{
            System.out.println("Your number is odd.");
        }
    }
}
