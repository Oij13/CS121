package weekFive;
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        final int constant = Integer.parseInt(scn.nextLine());

        int[] array_1 = new int[constant];
        int[] array_2 = new int[constant];
        int[] array_3 = new int[constant];
        int[] array_4 = new int[constant];
        for (int i = 0; i < constant; i++){
            System.out.printf("Enter array element %d: ", i);
            array_1[i] = Integer.parseInt(scn.next());
            array_2[i] = array_1[i];
            array_3[i] = array_1[i];
            array_4[i] = array_1[i];
        }
        System.out.println("Array 1");
        for (int i = 0; i < array_1.length; i++){
            System.out.printf("%d   ", array_1[i]);
        }
        System.out.println("");
        System.out.println("Array 2 -- copy");
        for (int i = 0; i < array_2.length; i++){
            System.out.printf("%d   ", array_2[i]);
        }
        System.out.println("");
        System.out.println("Array 3 -- squared");
        for (int i = 0; i < array_3.length; i++){
            array_3[i] = array_3[i] * array_3[i];
            System.out.printf("%d   ", array_3[i]);
        }
        System.out.println("");
        System.out.println("Array 4 -- reversed");
        for (int i = array_4.length - 1; i > -1; i--){
            System.out.printf("%d   ", array_4[i]);
        }

    }

}
