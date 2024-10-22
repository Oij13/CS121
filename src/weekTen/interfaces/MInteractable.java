package weekTen.interfaces;

public class MInteractable implements Interactable{
    private String name;

    public MInteractable(String name){
        this.name = name;
    }

    public void interact() {
        System.out.println(name + " is enrolling in a new class.");
    }
}
