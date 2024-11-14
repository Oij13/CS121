package weekTwelve.fileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOutput = new File("TestingFileWrite.txt");
        try{
            Scanner console = new Scanner(fileOutput);
            String header = console.nextLine();
            System.out.printf("%s",header);
            while(console.hasNextLine()){
                String name = console.next();
                String passWord = console.next();
                int score = Integer.parseInt(console.next());
                String playerCharacter = console.next();
                double winningPercentage = Double.parseDouble(console.next());

                System.out.printf("%n%-20s %-20s %6d %23s %15.2f",name,passWord,score,playerCharacter,winningPercentage);

            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
