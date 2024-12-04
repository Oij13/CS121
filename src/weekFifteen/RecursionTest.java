package weekFifteen;
import java.util.Scanner;
public class RecursionTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Recursion recursion = new Recursion();
        System.out.println("Please enter a number to count down from.");
        while (true) {
            try {
                int number = Integer.parseInt(scn.nextLine());
                System.out.println("Counting down from " + number);
                recursion.countDown(number);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number:");
            }
        }
        System.out.println("Please enter a letter of the alphabet");
        String letter = scn.nextLine();
        char ch;
        while (true){
            if (letter.length() == 1){
                ch = letter.charAt(0);

                if (Character.isLetter(ch)){
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a letter a-z");
                    letter = scn.nextLine();
                }
            } else {
                System.out.println("Invalid input. Please enter only one character.");
                letter = scn.nextLine();
            }
        }
        recursion.alphaBackwards(ch);
    }
}
