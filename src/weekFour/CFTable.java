package weekFour;


public class CFTable {
    public static void main(String[] args) {


        System.out.println("Celsius:   Fahrenheit:");
        for (int i = 0; i <= 20; i++){
            double f = (((double) 9 /5) * i + 32);
            System.out.printf("%s          %.1f \n",i,f);

        }
    }
}
