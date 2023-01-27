package challenges;

import java.io.NotSerializableException;

import javax.swing.*;

public class App {
//     public static void main(String[] args) {
//         kek(4, 5);
//     }  
//     public static void kek(int i, int y) {
//         for(int j = 0; j < 5; j++){
//         System.out.println(i * y); 
//         i++;
//         }    
//    };
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        int resultado = somar(Integer.parseInt(a), Integer.parseInt(b)); //parseInt para enviar um int para o "somar"
        System.out.println("Resultado: " + resultado);

        
    }
    public static int somar(int a, int b) { return a + b; }

    
      
}
