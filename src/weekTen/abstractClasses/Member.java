package weekTen.abstractClasses;

public class Member extends ClassUser {
    private int classesAttended;
    public Member(String name, int id, int classesAttended){
        super(name,id);
        this.classesAttended = classesAttended;
    }
    public int getClassesAttended(){
        return classesAttended;
    }
    public void setClassesAttended(int classesAttended){
        this.classesAttended = classesAttended;
    }

    public String displayInfo() {
        return String.format("Name: %s\nID: %d\nClasses Attended: %d\n", name, id, classesAttended);
    }


}
