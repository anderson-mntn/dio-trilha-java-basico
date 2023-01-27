package challenges;

import javax.swing.*;

public class UncheckedExceptionLesson {

    public static void main(String[] args) {

        boolean continueLooping = true;
        do{
            JOptionPane.showMessageDialog(null, "Digite os numeros que quer dividir");
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            double result = somar(Double.parseDouble(a), Double.parseDouble(b)); //parseInt para enviar um int para o "somar"
            System.out.println("Resultado: " + result);
    
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Entrada inválida, digite numero inteiro! " + e.getMessage());
        } catch (ArithmeticException e) { // ArithmeticException expressa se a expressão foi inválida, ex: dividir por 0.
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Impossível dividir numero por 0! "); // explorar o e.Metodos...
            continueLooping = false;

            // if(result == Double.NaN){
            //     System.out.println("The result was NaN! ");  
            //     continueLooping = false;
            // }

        } finally{
            System.out.println("Chegou no finally! ");
        }
        } while (continueLooping);
        

        System.out.println("O código continua...");
    }
    public static double somar(Double a, Double b) { return  a / b; }

    
      
}
