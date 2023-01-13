package loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Idade: ");
        idade = scan.nextInt();
        scan.close();
        System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade);
    }
}
