package weekTwelve.labTen;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Menu {
    Scanner scn = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();
    FileRead fileRead = new FileRead();

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
    private void createPokemon(){
        System.out.println("Select option: \n1) Create Pokemon Manually\n2) Select pokemon from file");
        String option = scn.nextLine();
        if (option.equals("1")) {


            System.out.print("Enter Pokemon name: ");
            String name = scn.nextLine();

            System.out.print("Enter Pokemon HP: ");
            int hp = Integer.parseInt(scn.nextLine());
            Pokemon newPokemon = new Pokemon(name, hp);
            addMovesToPokemon(newPokemon);
            pokedex.addPokemon(newPokemon);
            System.out.println("Pokemon added to Pokedex.");


        } else if (option.equals("2")) {
            try {


                ArrayList<String[]> pokemonData = fileRead.readPokemonData("CharacterStatsFile.txt");
                if (pokemonData.isEmpty()){
                    System.out.println("No Pokemon data is available in file.");
                    return;
                }
                System.out.println("Availbable Pokemon from file.");
                for (int i = 0; i < pokemonData.size(); i++){
                    System.out.println(i + 1 + "," + pokemonData.get(i)[0]);
                }

                System.out.print("Enter the number of the Pokémon to add from file: ");
                int name = Integer.parseInt(scn.nextLine());

                if (name < 1 || name > pokemonData.size()){
                    System.out.println("Invalid selection.");
                    return;
                }

                String[] selectedData = pokemonData.get(name -1);
                String selectedName = selectedData[0];
                int selectedHP = Integer.parseInt(selectedData[1]);
                Pokemon selectedPokemon = new Pokemon(selectedName, selectedHP);


                for (int i = 2; i < selectedData.length; i += 3){
                    String moveName = selectedData[i];
                    int power = Integer.parseInt(selectedData[i + 1]);
                    int speed = Integer.parseInt(selectedData[i +2]);
                    Move move = new Move(moveName, power, speed);
                    selectedPokemon.addMove(move);
                }
                    pokedex.addPokemon(selectedPokemon);
                    System.out.println("Pokemon name: " + name + " add to Pokedex. ");



            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


    }
    private void addMovesToPokemon(Pokemon pokemon){
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
                pokemon.addMove(move);
            }
        }
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
            ArrayList<Move> moves = pokemon.getMoveArrayList();
            if (moves.isEmpty()){
                System.out.println("No moves for this Pokemon.");
            }else {
                System.out.println("Moves: ");
                for (Move move : moves) {
                    System.out.println("  Move Name: " + move.getMoveName());
                    System.out.println("  Move Power: " + move.getMovePower());
                    System.out.println("  Move Speed: " + move.getMoveSpeed());
                }
                System.out.println();
            }
        }
    }
}


