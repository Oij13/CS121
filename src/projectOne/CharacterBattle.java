/*package projectOne;
import java.util.Scanner;
public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of rounds (must be odd): ");
        int rounds = Integer.parseInt(scn.nextLine());
        if (rounds % 2 == 0) {
            System.out.println("Not an odd number, adding one round to match!");
            rounds = rounds + 1;
        }

        String[] playerNames = new String[2];
        int[] playerHPs = new int[2];
        String[] playerMoves = new String[2];
        int[] playerPowers = new int[2];
        int[] playerAttackSpeeds = new int[2];

        for (int i = 0; i < rounds; i++){


            for (int j = 1; j <= 2; j++){
                System.out.printf("Player %d: Select a Character and enter its stats", i);
                System.out.println("Enter name:");
                playerNames= Integer.parseInt(scn.nextLine());
                System.out.println("Enter HP:");
                 = Integer.parseInt(scn.nextLine());
                System.out.println("Enter move name:");
                 = Integer.parseInt(scn.nextLine());
                System.out.println("Enter move's power:");
                 = Integer.parseInt(scn.nextLine());
                System.out.println("Enter attack speed:");
                 = Integer.parseInt(scn.nextLine());

            }

        }
    }
}
*/