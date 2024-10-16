package weekNine;

public class VIPMember extends GymMember {
    private int id;
    public VIPMember(String name, String memType, int conNum, int id){
        super(name,memType,conNum);
        this.id = id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String toString() {
    return String.format("Name: %s\nMembership Type: %s\nConfirmation Number: %d\nVIP ID: %d",name,memType,conNum,id);

    }

}
