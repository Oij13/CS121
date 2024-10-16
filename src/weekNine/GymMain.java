package weekNine;

public class GymMain {
    public static void main(String[] args) {
        GymScheduling memberOne = new GymScheduling("Joan",30,"Weight Training", "Monthly");
        GymScheduling memberTwo = new GymScheduling(9887);
        GymScheduling memberThree = new GymScheduling();

        memberOne.displayUser();
        memberTwo.displayMember();
        memberThree.displayUser();

        memberTwo.setCourse("Yoga");
        memberTwo.displayMember();

    }
}
