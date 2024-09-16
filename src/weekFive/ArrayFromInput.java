package weekFive;
import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] animal = new String[3];
        String[] color_animal = new String[3];
        int[] num_animal = new int[3];

        for (int i = 0; i < 3; i++){
            System.out.print("Name an animal: ");
            animal[i] = scn.nextLine();
            System.out.print("Name the color of the animal: ");
            color_animal[i] = scn.nextLine();
            System.out.print("Name the number of those animals that you see: ");
            num_animal[i] = Integer.parseInt(scn.nextLine());
            System.out.println("");

        }

        System.out.printf("%-14s %-14s %s \n", "ANIMAL", "COLOR", "NUMBER");
        System.out.println("");

        for (int i = 0; i < animal.length; i++) {
            System.out.printf("%-14s %-14s %d\n",
                animal[i], color_animal[i], num_animal[i]);
        }
        scn.close();
    }
}
