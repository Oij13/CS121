package weekSix;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array1 = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
        String [][] array3 = {
                {"Ann", "Andy", "Andrea"},
                {"John", "Joan", "Joanna"}
        };
        double [][] array2 = new double[3][4]; //{{1.1,2.2,}, {4.4,5.5,6.6},{7.7,8.8,9.9},{10.0,11.1,12.2}};
        array2[1][2] = 4.4;
        array2[0][3] = 3.3;
        for (int i=0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                System.out.printf("%d ", array1[i][j]);
            }
            System.out.println();
        }

        for (double[] numbers : array2){
            for(double col: numbers) {
                System.out.printf("%f\n", col);
            }

        }
        for (String row[]: array3){
            for(String coll: row) {
                System.out.printf("%s ", coll);
            }
            System.out.println();
        }
    }
}
