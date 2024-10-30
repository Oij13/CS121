package weekEleven.ArrayListDemo.linkedListActivity;

import java.util.LinkedList;

public class GymMember {

    private String name, email, membershipPlan;

    private LinkedList<String> enrolledClassesList = new LinkedList<>();

    public GymMember(){
    }

    public GymMember(String name, String email, String membershipPlan){
        this.name = name;
        this.email = email;
        this.membershipPlan = membershipPlan;
    }

    public void addEnrolledClass(String enrolledClass){
        enrolledClassesList.add(enrolledClass);
    }
    public void cancelEnrolledClass(String enrolledClass){
        enrolledClassesList.remove(enrolledClass);
    }
    public String getMemberInfo(){
        return String.format("Name: %s\nEmail: %s\nMembership Plan: %s\n",name,email,membershipPlan);
    }
    public void displayEnrolledClass(){
        System.out.println("Class Listing for Enrolled Student:\n");
        int i = 1;
        for (String enrolledClass: enrolledClassesList){
            System.out.printf("Class %d):%s\n",i,enrolledClass);
            i++;
        }
        System.out.println();
    }

}
