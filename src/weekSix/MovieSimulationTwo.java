package weekSix;
import java.util.Random;
public class MovieSimulationTwo {

    public static void main(String[] args) {


        String[] movieNames = {"Jumanji", "Matrix", "Star Wars"};
        String[] movieTypes = {"2D", "3D","2D"};
        double[] moviePrices = {15.25, 20.15, 18.11};

        final int ROWS = 5;
        final int COLUMNS = 10;
        int[][] movieAvailablility = new int [ROWS][COLUMNS];


        displayMovieDetails(movieNames, movieTypes, moviePrices);
        setSeatAvailability(movieAvailablility);
        randomizeAvailability(movieAvailablility);
        displaySeatAvailability(movieAvailablility);


    }
    static void setSeatAvailability(int [][] movieAvailability){
        System.out.println("\n ---------- INITIAL SEATS ----------\n");

        for (int i = 0; i < movieAvailability.length; i++){

            for (int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = 0;
            }
        }
    }
    static void displayMovieDetails(String [] movieNames, String [] movieTypes, double [] moviePrice){
        System.out.println("\nMovie Details: ");
        String header = String.format ("%-20s %-20s %-20s","Movie Name","Movie Type", "Movie Price");
        System.out.println(header);
        for (int i = 0; i < movieNames.length; i++) {
            String output = String.format("%-20s %-20s %-20.2f", movieNames[i], movieTypes[i], moviePrice[i]);
            System.out.println(output);
        }
    }

    public static void randomizeAvailability(int [][] movieAvailability){
        Random rand = new Random();
        for (int i = 0; i < movieAvailability.length; i++){

            for (int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
    }
    static void displaySeatAvailability(int [][] movieAvailability){
        System.out.println("\nSeating Availability: 1 = unavailable ; 0 = available");
        for (int i = 0; i < movieAvailability.length; i++){

            for (int j = 0; j < movieAvailability[i].length; j++){
                System.out.print( movieAvailability[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
