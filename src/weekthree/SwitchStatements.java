package weekthree;
import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String depth, volume, area, ocean;

        System.out.println("Enter one of the oceans: Antarctic, Pacific, Atlantic, or Indian ");
        ocean = (scn.nextLine());

        switch (ocean){
            case "Atlantic":
                ocean = "Atlantic";
                depth = "10,932 ft";
                volume ="310,410,900 cubic km";
                area ="41.1 million mi squared";
                System.out.printf("The %s ocean is %s deep, has a volume of %s, and has an area of %s.", ocean, depth, volume, area);
                break;
            case "Pacific":
                ocean = "Pacific";
                depth = "36,201 ft";
                volume ="714 million cubic km";
                area ="63.8 million mi squared";
                System.out.printf("The %s ocean is %s deep, has a volume of %s, and has an area of %s.", ocean, depth, volume, area);
                break;
            case "Indian":
                ocean = "Indian";
                depth = "23,920 ft";
                volume ="264 million cubic km";
                area ="27.24 million mi squared";
                System.out.printf("The %s ocean is %s deep, has a volume of %s, and has an area of %s.", ocean, depth, volume, area);
                break;
            case "Antarctic":
                ocean = "Antarctic";
                depth = "23,740 ft";
                volume ="71.8 million cubic km";
                area ="7.849 million mi squared";
                System.out.printf("The %s ocean is %s deep, has a volume of %s, and has an area of %s.", ocean, depth, volume, area);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
