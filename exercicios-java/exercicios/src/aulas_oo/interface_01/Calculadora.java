package aulas_oo.interface_01;

//Interface lesson 01 - implements - reclama se nao tiver todos mets


class  Calculadora implements Operations{
    @Override
    public void sum(double n1, double n2) {
         System.out.println("Sum :" + (n1 + n2));   
    }
    @Override
    public void sub(double n1, double n2) {
         System.out.println("Subtraction :" + (n1 - n2));   
    }
    @Override
    public void mult(double n1, double n2) {
         System.out.println("Multiplication:" + (n1 * n2));   
    }
    @Override
    public void division(double n1, double n2) {
         System.out.println("Division :" + (n1 / n2));   
    }
}
