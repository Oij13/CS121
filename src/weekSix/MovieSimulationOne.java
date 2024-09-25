package weekSix;
import java.util.Scanner;
public class MovieSimulationOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*String[] movieNames = {"Jumanji", "Matrix", "Star Wars"};
        String[] movieTypes = {"2D", "3D","2D"};
        int movieAvailability []= {11,5,7};
        double moviePrices [] = {15.25, 20.15, 18.11};*/

        System.out.println("How many movie details would you like to enter");
        final int constant = Integer.parseInt(scn.nextLine());

        String[] movieNames = new String [constant];
        String[] movieTypes = new String [constant];
        int movieAvailability []= new int [constant];
        double moviePrices [] = new double [constant];

        for (int i = 0; i < constant; i++){
            System.out.println("Enter in your character details" + (i+1));
            System.out.println("Movie Name:");
            movieNames[i] = scn.nextLine();
            System.out.println("Movie Type:");
            movieTypes[i] = scn.nextLine();
            System.out.println("Movie Availability:");
            movieAvailability[i] = Integer.parseInt(scn.nextLine());
            System.out.println("Movie Price:");
            moviePrices[i] = Double.parseDouble(scn.nextLine());

        }

        displayMovieDetails( movieNames,  movieTypes, movieAvailability,  moviePrices);
    }

    static void displayMovieDetails(String movieNames[], String movieTypes[], int movieAvailability[], double moviePrices[]){
        System.out.println("\nMovie Details: ");
        String header = String.format ("%-20s %-20s %-20s %-20s","Movie Name","Movie Type", "Available Seats", "Movie Price");
        System.out.println(header);
        for (int i = 0; i < movieNames.length; i++) {
            String output = String.format("%-20s %-20s %-20d %-20.2f", movieNames[i], movieTypes[i], movieAvailability[i], moviePrices[i]);
            System.out.println(output);
        }
    }

}
