
/*
Faça um programa que peça X numeros inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares
------
Make a program that ask for X int numbers,
calculate and show the amout of even and odd numbers
*/

package loops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        int quantNum; // amount of numbers that will be inserted by user
        int numero; // current inserted number
        int count = 0;
        int oddQuant = 0; //odd amount
        int evenQuant = 0; //even amount
        System.out.println("Quantidade de números que serão inseridos: ");
        quantNum = scan.nextInt();
   
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) evenQuant++; //if the number is Even, increment int eventQuant
            else oddQuant++;
            count++;
        } while (count < quantNum);

        System.out.println("Even amout: " + evenQuant);
        System.out.println("Odd amout: " + oddQuant);

        scan.close();


    }
}
