package weekTen.interfaces;

public class InterfaceTest {
    public static void main(String[] args) {
        MInteractable member = new MInteractable("Joe");
        TInteractable trainer = new TInteractable("Joseph");

        member.interact();
        trainer.interact();
    }
}
