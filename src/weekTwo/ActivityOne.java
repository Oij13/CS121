package weekTwo;
// alt + enter
import java.util.Scanner;

//Scanner
public class ActivityOne {
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
        System.out.println("Enter in the principal amount: ");

        //make scanner object
        //declare an object
        //Create an instance of the scanner class
        Scanner scn = new Scanner(System.in);
        //scn.nextdouble();     or parseDouble(scn.nextLine());
        //scn.nextInt();        or Integer.parseInt(scn.nextLine());
        P = Double.parseDouble(scn.nextLine());
        System.out.println("Enter in the annual interest rate: ");
        r = Double.parseDouble(scn.nextLine())/100;
        System.out.println("Enter in the number of times compounded: ");
        n = Integer.parseInt(scn.nextLine());
        System.out.println("Enter in the years: ");
        t = Integer.parseInt(scn.nextLine());
        //A = P(1 + r/n)^nt
        A = P * Math.pow(1 + (r/n),n*t);
        // %s String
        // %f Floats
        // %d Integers
        // %c Characters
        System.out.printf("After %d years you will have $ %.2f",t,A);


    }
}
