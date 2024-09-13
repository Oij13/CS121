package weekthree;
import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String vegetarian, vegan, glutenfree;

        System.out.println("Is there anyone in your party that is vegetarian?");
        vegetarian = scn.nextLine();
        System.out.println("Is there anyone in your party that is vegan?");
        vegan = scn.nextLine();
        System.out.println("Is there anyone in your party that is gluten-free?");
        glutenfree = scn.nextLine();

        String joe = "Joe's Gourmet Burgers";
        String main = "Main Street Pizza Company";
        String corner = "Corner Cafe";
        String mama = "Mama's Fine Italian";
        String chef = "The Chef's Kitchen";
        if(vegetarian.equals("no") && vegan.equals("no") && glutenfree.equals("no")){
            System.out.printf("\t%s", joe);
        }
        if(vegan.equals("no") && glutenfree.equals("no")) {
            System.out.printf("\t%s", mama);
        }
        if(vegan.equals("no")) {
            System.out.printf("\t%s", main);
        }
        System.out.printf("\t%s%n\t%s", corner,chef);

    }

}