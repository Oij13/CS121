package weekEleven.HashMap;
import java.util.HashMap;

public class YourClassName {

    private HashMap<String,String> entryMap = new HashMap<>();

    public void addEntry(String entryID, String details){
        entryMap.put(entryID, details);
    }
    public void removeEntry(String entryID){
        entryMap.remove(entryID);
    }
    public String getEntryDetails(String entryID){
        String details = "";
        if (entryMap.containsKey(entryID)) {
            details = String.valueOf(entryMap.get(entryID));
        }
        return details;
    }
    public void displayAllEntries() {
        entryMap.forEach((key, value) -> {
            System.out.println("Entry ID: " + key + "\n Details: " + value + "\n");
        });
    }
}
