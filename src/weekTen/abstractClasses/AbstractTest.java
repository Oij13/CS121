package weekTen.abstractClasses;

public class AbstractTest{
    public static void main(String[] args) {
        Member member = new Member("Joe", 9998,17);
        Trainer trainer = new Trainer("Greg",4445,46);

        System.out.println(member.displayInfo());
        System.out.println(trainer.displayInfo());
    }
}
