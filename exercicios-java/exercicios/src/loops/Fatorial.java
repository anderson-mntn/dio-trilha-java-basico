package loops;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 Example: 5!= 120 (5 X 4 X 3 X 2 X 1)
 -----
 Make a program to calculate the fatorial number of a int given by user.
 Example: 5!= 120 (5 X 4 X 3 X 2 X 1)
 -----
 while = laços infinitos e que terá um break.
 do while = executar uma vez antes de entrar nas condiçóes do while.
 for = loops, onde usamos countador .
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplier = 1;

    
        for (int i = fatorial; i >= 1; i--) {
            multiplier = multiplier * i;
        }
        System.out.println(fatorial + " != " + multiplier);
        
        scan.close();
    }
}
