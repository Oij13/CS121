package weekSeven;
import java.util.Scanner;
import java.util.Random;

public class MovieSimulationThree {
    public static void main(String[] args) {


        String[] movieNames = {"Jumanji", "Matrix", "Star Wars"};
        String[] movieTypes = {"2D", "3D","2D"};
        double[] moviePrices = {15.25, 20.15, 18.11};

        final int ROWS = 5;
        final int COLUMNS = 10;
        int[][] movieAvailablility = new int [ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrices);
        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames[index],movieTypes[index],moviePrices[index]);
        /*displayMovieDetails(movieNames, movieTypes, moviePrices);
        setSeatAvailability(movieAvailablility);
        displaySeatAvailability(movieAvailablility);*/
        randomizeAvailability(movieAvailablility);
        displaySeatAvailability(movieAvailablility);


    }

    static void displaySelectedMovie(String movieNames, String movieTypes, double moviePrices){
        System.out.printf("\n%s Movie Selections %s\n","-".repeat(20),"-".repeat(20));
        System.out.printf("%-20s %-20s%-20s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-25s%-20s$%.2f\n", movieNames,movieTypes,moviePrices);
    }


    static int selectMovie(String movieNames[]){
        Scanner scn = new Scanner(System.in);
        String selectedMovie;
        while(true){
            System.out.println("\nEnter the Movie name you are going to see: ");
            selectedMovie = scn.nextLine();
            for (int i = 0; i < movieNames.length; i++){
                if (selectedMovie.equals(movieNames[i])){
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again:\n ");
        }


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

        /*char rowLabel[] = {'A', 'B', 'C', 'D', 'E'};
        for (int c = 1; c <= movieAvailability[0].length; c++){
            System.out.printf("%d  ", c);

        }

        System.out.printf("\n%s", "-".repeat(30));

        for (int i = 0; i < movieAvailability.length; i++){
            System.out.printf("\n %c|",rowLabel[i]);
        }*/

        for (int i = 0; i < movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
    }
    static void displaySeatAvailability(int [][] movieAvailability){
        System.out.println("\nSeating Availability: 1 = unavailable ; 0 = available");
        char rowLabel[] = {'A', 'B', 'C', 'D', 'E'};
        System.out.print("    ");
        for (int c = 1; c <= movieAvailability[0].length; c++){
            System.out.printf("%d ", c);

        }
        System.out.println("");
        for (int i = 0; i < movieAvailability.length; i++){
            System.out.printf("%c | ", rowLabel[i]);
            for (int j = 0; j < movieAvailability[i].length; j++){
                System.out.print( movieAvailability[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

