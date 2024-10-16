package weekNine;

public class RegularMember extends GymMember {
    private int age;
    public RegularMember(String name, int age, String memType, int conNum){
        super(name, memType, conNum);
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String toString() {
        return String.format("Name: %s\nAge: %d\nMembership Type: %s\nConfirmation Number: %d\n",name,age,memType,conNum);
    }

}
