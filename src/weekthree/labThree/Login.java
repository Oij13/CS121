package weekthree.labThree;
import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String name = "six";
        String password = "6";

        String name1 = (JOptionPane.showInputDialog("Enter your username: "));
        String password1 = (JOptionPane.showInputDialog("Enter your password: "));

        if (name.equals(name1) && password.equals(password1)){
            JOptionPane.showMessageDialog( null,"Welcome to CS121.");
        }
        else if (!name.equals(name1) && password.equals(password1)){
            JOptionPane.showMessageDialog(null,"your username is wrong");
        }
        else if (name.equals(name1) && !password.equals(password1)){
            JOptionPane.showMessageDialog(null,"your password is wrong");
        }
        else{
            JOptionPane.showMessageDialog(null,"both are wrong");
        }
    }
}
