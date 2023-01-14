package arrays;

import java.util.Random;

/*
 * Print 4X4array  with random values between 0-9.
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        // array[line][column]
        int[][] M = new int [4][4]; //Defined 4 lines e 4 columns.
        
        //setting numbers
        int columnQtt = 0;
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
            
        }
        
        //printing line and columns
        for (int[] line: M) {
            columnQtt++;
            System.out.print("Column " + columnQtt + ": ");
            for (int columnElement : line) {
                System.out.print(columnElement + " ");
            }
            System.out.println();
        }
    }
}
