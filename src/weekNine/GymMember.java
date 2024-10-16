package weekNine;

public class GymMember {
    protected String name;
    protected String memType;
    protected int conNum;

    public GymMember(String name, String memType, int conNum){
        this.name = name;
        this.memType = memType;
        this.conNum = conNum;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMemType(String memType){
        this.memType = memType;
    }
    public String getMemType(){
        return memType;
    }
    public void setConNum(int conNum){
        this.conNum = conNum;
    }
    public int getConNum(){
        return conNum;
    }

    public String toString(){
        return String.format("Name: %s\nMembership Type: %s\nConfirmation Number: %s\n",name,memType,conNum);
    }
}
