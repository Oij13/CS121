package weekTwelve.labTen;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    Scanner scn = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();

    public Menu(){

    }
    public void displayMenu() {
        Boolean keepGoing = true;
        while (keepGoing) {
            System.out.print("********* MENU *********\n" +
                    "1) Add a Pokemon\n" +
                    "2) Remove a Pokemon\n" +
                    "3) Display Pokemon Info\n" +
                    "4) Display All Pokemon Info\n" +
                    "5) Exit\n");
            String choice = scn.nextLine();
            //int input = Integer.parseInt(scn.nextLine());
            if (choice.equals("1")) {
                createPokemon();
            } else if (choice.equals("2")) {
                deletePokemon();
            } else if (choice.equals("3")) {
                displayPokemon();
            } else if (choice.equals("4")) {
                displayAllPokemon();
            } else if (choice.equals("5")) {
                keepGoing = false;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }
    private void createPokemon() {
        System.out.print("Enter Pokemon name: ");
        String name = scn.nextLine();
        System.out.print("Enter Pokemon HP: ");
        int hp = Integer.parseInt(scn.nextLine());

        Pokemon newPokemon = new Pokemon(name, hp);
        Boolean keepGoing = true;
        while (keepGoing){
            System.out.print("Enter Pokemon's Move or 'q' to finish: ");
            String moveName = scn.nextLine();
            if (moveName.equals("q")){
                keepGoing = false;
            }
            else {

                System.out.print("Enter move power:");
                int power = Integer.parseInt(scn.nextLine());
                System.out.print("Enter move speed:");
                int speed = Integer.parseInt(scn.nextLine());

                Move move = new Move(moveName, power, speed);
                newPokemon.addMove(move);
            }
        }
        pokedex.addPokemon(newPokemon);
        System.out.println("Pokemon added to Pokedex.");
    }
    private void deletePokemon() {
        System.out.print("Enter name of Pokemon to delete: ");
        String name = scn.nextLine();
        Pokemon pokemon = pokedex.getPokemon(name);

        if (pokemon == null) {
            System.out.println("Pokemon not found.");
        } else {
            pokedex.removePokemon(pokemon);
            System.out.println( name + " deleted from Pokedex");
        }
    }
    private void displayPokemon(){
        System.out.print("Enter name of the Pokemon to display: ");
        String name = scn.nextLine();

        Pokemon pokemon = pokedex.getPokemon(name);
        if (pokemon == null){
            System.out.println("Pokemon not found.");
        } else{
            System.out.println(pokemon);
        }
    }
    private void displayAllPokemon(){
        ArrayList<Pokemon> pokemonArrayList = pokedex.getAllPokemon();
        if (pokemonArrayList.isEmpty()){
            System.out.println("Pokedex is empty, no Pokemon to display.");
        }
        for (Pokemon pokemon : pokemonArrayList) {
            System.out.println(pokemon);
        }
    }
}


