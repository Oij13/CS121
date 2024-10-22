package weekTen.interfaces;

public class TInteractable implements Interactable{

    private String name;

    public TInteractable(String name){
        this.name = name;
    }

    public void interact() {
        System.out.println(name + " is scheduling a training session.");
    }
}
