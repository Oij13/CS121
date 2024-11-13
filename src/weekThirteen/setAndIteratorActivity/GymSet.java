package weekThirteen.setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class GymSet {
    Set<String> tables = new HashSet<>();

    public void addTables() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter table names or numbers to add (enter '0' to quit)");

        while (true) {
            String table = scn.nextLine();
            if (table.equals("0")) {

                return;
            } else if (!table.equals("0")) {
                tables.add(table);
                System.out.printf("%s added to table\n",table);
                System.out.println("Add another table or '0' to quit");
            }
        }
    }
    public void displayTables(){
        Iterator<String> iterator = tables.iterator();

        System.out.println("Gym Tables: ");
        while (iterator.hasNext()) {
            String tableName = iterator.next();
            System.out.println(tableName);
        }

    }
}
