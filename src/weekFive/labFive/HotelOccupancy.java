package weekFive.labFive;
import java.util.Scanner;
public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int floors;
        int totalRooms = 0;
        int totalOccupiedRooms = 0;
        int totalEmptyRooms;
        double occupancyRate;

        System.out.println("Enter the number of floors: ");
        floors = Integer.parseInt(scn.nextLine());
        for (int i = 1; i <= floors; i++) {
            System.out.printf("Enter number of rooms on floor %d \n", i);
            int rooms = Integer.parseInt(scn.nextLine());
            System.out.printf("How many rooms are occupied on floor %d \n", i);
            int occupiedRooms = Integer.parseInt(scn.nextLine());

            totalRooms = totalRooms + rooms;
            totalOccupiedRooms = totalOccupiedRooms + occupiedRooms;
        }

        totalEmptyRooms = totalRooms - totalOccupiedRooms;
        occupancyRate = (double) totalOccupiedRooms/totalRooms;

        System.out.printf("Floors: %d\nRooms: %d\nOccupied Rooms: %d\nVacant Rooms: %d\nOccupancy: %.2f\n", floors, totalRooms, totalOccupiedRooms, totalEmptyRooms, occupancyRate);


    }
}
