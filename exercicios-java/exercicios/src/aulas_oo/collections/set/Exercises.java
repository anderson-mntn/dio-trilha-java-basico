package aulas_oo.collections.set;
import java.util.Scanner;

/*
 * Algoritmo de radar para verificar se o motorista está na 
 * velocidade máxima permitida (60km/h)
 */

public class Exercises {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        if(velocidadeAtual <= 60) System.out.println("Nao foi multado");
        else System.out.println("Foi multado");
    }
}
