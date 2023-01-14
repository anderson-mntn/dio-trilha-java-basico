package arrays;

import java.util.Random;

/*
 * Make a program that read 20 int random numbers between 1 - 10,
 * and store them in a array.
 * Print the numbers and their sucessors
 * Introducing the "Random" class.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrRandomNums = new int[20];

        for(int i = 0 ; i < arrRandomNums.length; i++){
            int randomNumber = random.nextInt(100);
            arrRandomNums[i] = randomNumber;
        }


        System.out.print("Random Numbers: ");
        for (int i : arrRandomNums) {
            System.out.print(i + " ");
        }

        System.out.print("\nSucessor Number: ");
        for (int i : arrRandomNums) {
            System.out.print((i+1) + " ");
        }
        System.out.println("\n");

    }
}
