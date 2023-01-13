package loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){

            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break; //Digitar 0 para encerrar o recebimento de dados dos usuários
            
            System.out.println("Idade: ");
            idade = scan.nextInt();
            System.out.println("Usuário cadastrado! Seu nome é " + nome + ", e sua idade é " + idade + "!");
            System.out.println("Próximo usuário...");
        }

        //System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade);
        scan.close();
        System.out.println("Programa Encerrado.");
    }
}
