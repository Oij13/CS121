package weekOne;

public class Firstcodewithme {
    public static void main(String[] args) {

        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;

        age = 1;
        gpa = 3.9;
        letterGrade = 'A';
        csMajor = true;
        name = "Owen";

        String favoriteColor = "periwinkle";

        System.out.printf("This person is %d years old %n--------",age);
        System.out.printf(" The gpa is %.2f out of 4%n",gpa);
        System.out.printf("The letter grade is : %c%n",letterGrade);
        System.out.printf("Is it true that your major is computer science? %b%n",csMajor);
        System.out.printf("This persons name is: %s%n",name);

        System.out.println("Your age is: " + age);
    }
}
