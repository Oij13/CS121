package weekEleven.ArrayListDemo.linkedListActivity;

public class Main {
    public static void main(String[] args) {
        GymMember member1 = new GymMember("John","johns23@email.com","Monthly");
        GymMember member2 = new GymMember("Jane","janes25@email.com","Yearly");


        member1.addEnrolledClass("Yoga");
        member1.addEnrolledClass("Palates");
        member1.addEnrolledClass("Dog Yoga");
        member2.addEnrolledClass("Gym");
        member2.addEnrolledClass("Weight Training");
        member2.addEnrolledClass("Calisthenics");

        member1.displayEnrolledClass();
        System.out.println(member1.getMemberInfo());
        member2.displayEnrolledClass();
        System.out.println(member2.getMemberInfo());

        member1.cancelEnrolledClass("Palates");
        member2.cancelEnrolledClass("Gym");

        member1.displayEnrolledClass();
        member2.displayEnrolledClass();
    }
}
