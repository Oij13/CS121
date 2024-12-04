import java.util.LinkedList;

public class lab13Practice {

    public static void main(String[] args)
    {
// An Instance of the LinkedList class
        LinkedList<String> names = new LinkedList<>();
//Adding names to list
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.addFirst("Winston");
        names.addLast("Jess");
        names.add("Kyle");
//Displays the list
        System.out.printf("Names list: %s%n", names);
// Question #2
// set values and adds to a position in a LinkedList
// What will be displayed? Draw a diagram showing the nodes for each element.
                names.set(0, "Tom");
        System.out.printf("Names list: %s%n", names);
// #Question #3
// set values and adds to a position in a LinkedList
// What will be displayed? Draw a diagram showing the nodes for each element.
                names.add(4, "Clark");
        System.out.printf("Names list: %s%n", names);
// Question #4
// removes an elements from the list.
// What will be displayed? Draw a diagram showing the nodes for each element.
                names.remove(0);
        System.out.printf("Names list: %s%n", names);
    }
}


