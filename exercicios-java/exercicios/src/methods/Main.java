package methods;

public class Main {
    public static void main(String[] args) {
        Calculator.sum(3, 6);
        Calculator.sub(10, 5);
        Calculator.multiplication(7, 7);
        Calculator.division(365, 7);

        DayMessage.getMessage(1);
        DayMessage.getMessage(9);
        DayMessage.getMessage(13);
        DayMessage.getMessage(19);

        //Overloading Lesson
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);
    }   
}
