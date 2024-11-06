package weekTwelve.fileIO;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException{

        try {
            FileWriter fileWriter = new FileWriter("TestingFileWriter.txt",true);
            PrintWriter output = new PrintWriter(fileWriter);

            String name = JOptionPane.showInputDialog("Enter the user's name:");
            String passWord = JOptionPane.showInputDialog("Enter the user's password:");
            String playerCharacter = JOptionPane.showInputDialog("Enter the user's player character:");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter the user's score:"));
            double winningPercentage = Double.parseDouble(JOptionPane.showInputDialog("Enter the user's winning percentage:"));


            output.printf("\n%-20s %-20s %6d %23s %15.2f",name,passWord,score,playerCharacter,winningPercentage);

            fileWriter.close();
            output.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
