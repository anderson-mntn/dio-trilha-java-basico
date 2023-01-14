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
        int count = 0;

        //System.out.println(vetor.length);

        while(count < (vetor.length -1)){
            System.out.println(vetor[count]);
            count++;
        }
    }
}
