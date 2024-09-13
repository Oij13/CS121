package weekTwo;
// alt + enter
import java.awt.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Scanner
public class ActivityOneDialog {
    // main + tab
    public static void main(String[] args) {
        //P- principal amount
        //r- annual interest rate
        //n- number of times per year that the interest is compounded
        //t- specifies number of years
        //A- the amount of money in the account after the specified number of years
        double P,r,A;
        int n,t;

        //promt user
        //sout + tab

        P=Double.parseDouble(JOptionPane.showInputDialog("Enter in the principal amount: "));
        r=Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate: "))/100;
        n=Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of times compounded: "));
        t=Integer.parseInt(JOptionPane.showInputDialog("Enter in the years: "));

        // %s String
        // %f Floats
        // %d Integers
        // %c Characters
        A = P * Math.pow(1 + (r/n),n*t);
        System.out.printf("After %d years you will have $ %.2f",t,A);

        JOptionPane.showMessageDialog(null,String.format("The balance" + "of the account after %d years you will have $%.2f", t,A));


    }
}
