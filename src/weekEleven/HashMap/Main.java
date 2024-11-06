package weekEleven.HashMap;

public class Main {
    public static void main(String[] args) {
        YourClassName demo = new YourClassName();
        String entryID;
        String details;

        demo.addEntry("Three","Third number");
        demo.addEntry("Two","2");
        demo.addEntry("Eighteen","18");
        //System.out.println(demo.getEntryDetails("Two"));
        demo.displayAllEntries();
        demo.removeEntry("Two");
        demo.displayAllEntries();
    }
}
