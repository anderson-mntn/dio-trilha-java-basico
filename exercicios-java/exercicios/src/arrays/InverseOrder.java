package arrays;

/*
 * Crie um vetor/array de 6 números inteiros e mostre na order inverse.
 * -----
 * Make a array of 6 int numbers and show it in inverse order.
 */
public class InverseOrder {
    public static void main(String[] args) {
        //Temos que declarar tipo dos elementos que estarão dentro do array.
        int[] vetor = {3, 6, 9, 12, -2, -4, 72, 36};
        
        //System.out.println(vetor.length);
        
        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor Inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--) { //i recebe array.lenght e será decrementado
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\n");


    }
}
