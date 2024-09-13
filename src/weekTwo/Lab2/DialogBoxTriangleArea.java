package weekTwo.Lab2;

import javax.swing.*;

public class DialogBoxTriangleArea {
    public static void main(String[] args) {
        double base,height;

        base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of a triangle: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of a triangle: "));

        double area = ((.5 * base) * height);
        String Message = String.format("The area of the triangle is %.1f cm^2", area);
        JOptionPane.showMessageDialog(null, Message);
    }
}
