package weekTen.abstractClasses;

public class AbstractTest extends ClassUser{
    private int classesConducted;
    public AbstractTest(String name,int id,int classesConducted){
        super(name,id);
        this.id = classesConducted;
    }
    public int getClassesConducted(){
        return classesConducted;
    }
    public void setClassesConducted(int classesConducted){
        this.classesConducted = classesConducted;
    }
    public String displayInfo(){
        return String.format("Name: %s\nID: %d\nClasses Conducted: %d\n", name, id, classesConducted);
    }
}
