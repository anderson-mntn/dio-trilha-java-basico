package methods;

public class Calculator {
    public static void sum(double n1, double n2){
        double result = n1 + n2;
        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + result);
    }
    public static void sub(double n1, double n2){
        double result = n1 - n2;
        System.out.println("The subtraction of " + n1 + " and " + n2 + " is: " + result);
    }
    public static void division(double n1, double n2){
        double result = n1 / n2;
        System.out.println("The division of " + n1 + " and " + n2 + " is: " + result);
    }
    public static void multiplication(double n1, double n2){
        double result = n1 * n2;
        System.out.println("The multiplication of " + n1 + " and " + n2 + " is: " + result);
    }
}
