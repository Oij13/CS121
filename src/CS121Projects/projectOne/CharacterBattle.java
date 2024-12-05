package CS121Projects.projectOne;
import java.util.Scanner;

public class CharacterBattle {
    private static void promptEnterKey(Scanner scn) {
        System.out.println("Press Enter to continue...");
        scn.nextLine();
    }
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



        for (int j = 0; j < 2; j++){
            System.out.printf("Player %d: Select a Character and enter its stats \n", j + 1);
            System.out.println("Enter name:");
            playerNames[j] = scn.nextLine();
            System.out.println("Enter HP:");
            playerHPs[j] = Integer.parseInt(scn.nextLine());
            System.out.println("Enter move name:");
            playerMoves[j] = scn.nextLine();
            System.out.println("Enter move's power:");
            playerPowers[j] = Integer.parseInt(scn.nextLine());
            System.out.println("Enter attack speed:");
            playerAttackSpeeds[j] = Integer.parseInt(scn.nextLine());

        }


        int[] wins = new int[2];

        for (int round = 0; round < rounds; round++){
            int[] currentHP = {playerHPs[0], playerHPs[1]};

            while (currentHP[0] > 0 && currentHP[1] > 0) {
                if (playerAttackSpeeds[0] > playerAttackSpeeds[1]) {
                    currentHP[1] -= playerPowers[0];
                    System.out.println(playerNames[0] + " does " + playerPowers[0] + " damage to " + playerNames[1] + "[" + currentHP[1] +"]");

                    if (currentHP[1] <= 0) {
                        System.out.println(playerNames[0] + " wins this round!");
                        wins[0]++;
                        break;
                    }
                    promptEnterKey(scn);
                    currentHP[0] -= playerPowers[1];
                    System.out.println(playerNames[1] + " does " + playerPowers[1] + " damage to " + playerNames[0] + "[" + currentHP[0] +"]");

                    if (currentHP[0] <= 0) {
                        System.out.println(playerNames[1] + " wins this round!");
                        wins[1]++;
                        break;
                    }
                    else {
                        System.out.println();
                    }
                    promptEnterKey(scn);
                }
                else if (playerAttackSpeeds[1] > playerAttackSpeeds[0]) {
                    currentHP[0] -= playerPowers[1];
                    System.out.println(playerNames[1] + " does " + playerPowers[1] + " damage to " + playerNames[0] + "[" +currentHP[0] + "]");

                    if (currentHP[0] <= 0) {
                        System.out.println(playerNames[1] + " wins this round!");
                        wins[1]++;
                        break;
                    }
                    promptEnterKey(scn);
                    currentHP[1] -= playerPowers[0];
                    System.out.println(playerNames[0] + " does " + playerPowers[0] + " damage to " + playerNames[1] + "[" + currentHP[1] + "]");

                    if (currentHP[1] <= 0){
                        System.out.println(playerNames[0] + " wins this round!");
                        wins[0]++;
                        break;
                    }
                    promptEnterKey(scn);
                }
                else {
                    if (Math.random() < 0.5) {
                        currentHP[1] -= playerPowers[0];
                        System.out.println(playerNames[0] + " does " + playerPowers[0] + " damage to " + playerNames[1] + "[" + currentHP[1] + "]");

                        if (currentHP[1] <= 0) {
                            System.out.println(playerNames[0] + " wins this round!");
                            wins[0]++;
                            break;
                        }
                        promptEnterKey(scn);
                        currentHP[0] -= playerPowers[1];
                        System.out.println(playerNames[1] + " does " + playerPowers[1] + " damage to " + playerNames[0] + "[" + currentHP[0] + "]");
                        if (currentHP[0] <= 0) {
                            System.out.println(playerNames[1] + " wins this round!");
                            wins[1]++;
                            break;
                        }
                        promptEnterKey(scn);
                    }


                    else {
                        currentHP[0] -= playerPowers[1];
                        System.out.println(playerNames[1] + " does " + playerPowers[1] + " damage to " + playerNames[0] +"[" + currentHP[0] + "]");

                        if (currentHP[0] <= 0) {
                            System.out.println(playerNames[1] + " wins this round!");
                            wins[1]++;
                            break;
                        }
                        promptEnterKey(scn);
                        currentHP[1] -= playerPowers[0];
                        System.out.println(playerNames[0] + " does " + playerPowers[0] + " damage to " + playerNames[1] + "[" + currentHP[1] + "]");
                        if (currentHP[1] <= 0) {
                            System.out.println(playerNames[0] + " wins this round!");
                            wins[0]++;
                            break;
                        }
                        promptEnterKey(scn);

                    }
                }
            }
        }
        promptEnterKey(scn);
        System.out.println("The Final Scores are:");
        System.out.println(playerNames[0] + ": " + wins[0] + " wins");
        System.out.println(playerNames[1] + ": " + wins[1] + " wins");
        if (wins[0] > wins[1]){
            System.out.println(playerNames[0] + " Wins!");
        } else if (wins[1] > wins[0]) {
            System.out.println(playerNames[1] + " Wins!");
        }

        scn.close();

    }
}
