package weekFour;
import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int speed,hours;
        System.out.println("Enter the speed of the vehicle in mph: ");
        speed = Integer.parseInt(scn.nextLine());
        System.out.println("Enter the number of hours traveling: ");
        hours = Integer.parseInt(scn.nextLine());

        System.out.println("Hour:   Distance Travelled");
        for (int i=1; i <= hours; i++){
            int dist = (speed * i);
            System.out.printf("%d       %d \n",i,dist);
        }
    }
}
