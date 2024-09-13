package weekFour;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();


        int number = rnd.nextInt(1,100);
        int counter = 0;


        boolean q = false;
        while(!q){
            System.out.println("Guess a number from 1 to 100, or enter 'q' if you give up");
            String userGuess = scn.nextLine();
            if(userGuess.equals("q")){
                System.out.printf("Quitter the number was %d",number);
                q = true;
                break;

            }else{
                int uGuess = Integer.parseInt(userGuess);
                if(uGuess > number){
                    System.out.println("Too high");
                    counter++;
                }
                else if(uGuess < number){
                    System.out.println("Too low");
                    counter++;
                }
                else{
                    System.out.println("Thats Correct!");
                    counter++;
                    System.out.printf("Number of guesses: %d",counter);

                    break;
                }
            }
        }
    }
}
