package weekEight.packageDemo;

import javax.swing.text.html.StyleSheet;

public class Person {
    public String firstName;
    public String lastName;

    private int age;
    private String address;
    private double salary;

    public Person(String FirstName, String LastName, int Age, String Address, double Salary){

        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
        this.address = Address;
        this.salary = Salary;

    }
    public void displayFullName(){
        System.out.printf("Full Name: %s %s\nAge:%d\nAddress:%s\nSalary:%.2f\n",firstName,lastName,age,address,salary);
    }
    private void displayAge(){
        System.out.println("Age" + age);
    }
    protected void displayAddress(){
        System.out.println("Address" + address);
    }
    void displaySalary(){
        System.out.println("Salary" + salary);
    }


    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }
}
