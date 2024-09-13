package weekTwo.Lab2;
import javax.swing.*;

public class DialogBoxRectangleArea {
    public static void main(String[] args) {
        double length,width;

        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of a rectangle: "));
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of a rectangle"));

        double area = (length * width);
        String Message = String.format("The area of the rectangle is %.1f", area);
        JOptionPane.showMessageDialog(null, Message);
    }
}
