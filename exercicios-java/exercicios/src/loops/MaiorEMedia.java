package loops;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números
 * Informe o maior número
 * Informe as médias dos números
 * Usando o "do - while" - mais ou menos como se fosse o if do js;
 */

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    

        int numero;
        int maiorNum = 0;
        int mediaAccumulator = 0; 

        int count = 0;
        
        do {
            System.out.println("Digite uma nota (número): ");
            numero = scan.nextInt();
            count = count + 1;
            mediaAccumulator = mediaAccumulator + numero;

            if (numero > maiorNum) maiorNum = numero;

        } while(count < 5); // 5 -> counter passar com o 0 uma vez
        
        System.out.println("O maior número (nota) foi: " + maiorNum);
        System.out.println("Sua média foi: " + mediaAccumulator / 5);
        scan.close();
    }
}
