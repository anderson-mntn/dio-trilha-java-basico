package arrays;
/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * diga quantas consoantes foram lidas e as imprima.
 * -----
 * Make a program that read de array of 6 chars,
 * tell how many consonants were found and print them.
 */

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qttConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                qttConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("| Quantidade de consoantes: " + qttConsoantes);
        System.out.println(consoantes.length);

    }

}