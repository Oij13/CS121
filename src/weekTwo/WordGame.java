package weekTwo;

import javax.swing.JOptionPane;

public class WordGame {
    public static void main(String[] args) {
        String name, college, major, animal, petName;
        int age;
        name = JOptionPane.showInputDialog("Enter your name: ");
        college = JOptionPane.showInputDialog("Enter the name of a college: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        major = JOptionPane.showInputDialog("Enter the name of your major: ");
        animal = JOptionPane.showInputDialog("Enter a type of animal: ");
        petName = JOptionPane.showInputDialog("Enter a pet name: ");




        String message = ("There once was a person named " + name + " who lived in city. At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated with a major in " + major + ". Then, " + name + " adopted a(n) " + animal + " named" + petName + ". They both lived happily ever after!");


        JOptionPane.showMessageDialog(null, message);
    }
}
