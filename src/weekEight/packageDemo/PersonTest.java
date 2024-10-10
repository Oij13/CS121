package weekEight.packageDemo;

public class PersonTest {
    public static void main(String[] args) {
        Person personOne = new Person("John", "Doe", 30, "123 Elm St", 55000.00);
        Person personTwo = new Person("Jane", "Doe", 30, "123 Elm St", 45000.00);

        personOne.displayFullName();
        personTwo.displayFullName();

        personOne.lastName = "DoeA";
        personTwo.lastName = "DoeB";

        personOne.setAge(36);
        personTwo.setSalary(55000.00);
        personOne.setAddress("124 Elm St.");

        personOne.displayAddress();
        personOne.displaySalary();
        //personOne.displayAge();


        personOne.displayFullName();
        personTwo.displayFullName();

    }
}
