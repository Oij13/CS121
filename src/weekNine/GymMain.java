package weekNine;

import java.sql.SQLOutput;

public class GymMain {
    public static void main(String[] args) {
        /*GymScheduling memberOne = new GymScheduling("Joan",30,"Weight Training", "Monthly");
        GymScheduling memberTwo = new GymScheduling(9887);
        GymScheduling memberThree = new GymScheduling();

        memberOne.displayUser();
        memberTwo.displayMember();
        memberThree.displayUser();

        memberTwo.setCourse("Yoga");
        memberTwo.displayMember();*/

        VIPMember vipMember = new VIPMember("Mike","Monthly",555444,999888);
        System.out.println();
        System.out.println(vipMember);

        RegularMember regMember = new RegularMember("Michel", 43,"Yearly",666777);
        System.out.println();
        System.out.println(regMember);
    }
}
