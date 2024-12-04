package weekFifteen;

public class Recursion {
    public static void countDown(int number){
        if (number == 0){
            System.out.println("Blast Off!");
        }else{
            System.out.println("");
            System.out.println(number+".");
            countDown(number - 1);
        }
    }
    public void alphaBackwards(char letter){
        if (letter == 'a'){
            System.out.println(letter);
        }else {
            System.out.println(letter);
            alphaBackwards((char) (letter - 1));
        }
    }

}
