package aulas_oo.herança_02;

/*
 * Learning polymorphism and Override
 */

public class Runner {
    public static void main(String[] args) {
        // Create array
        ParentClass[] classes = new ParentClass[]{new ChildClass1(), new ChildClass2(), new ParentClass()};

        // Comportamento polimórfico, executou o metodo 1 de cada class.
        for (ParentClass item : classes) {
            item.method1();
        }
        System.out.println("-------------");

        // ChildClass1 não tem method2, então irá herdar o method2 da sua parent class.
        for (ParentClass item : classes) {
            item.method2();
        }
        System.out.println("-------------");

        // Override - não usar o metodo2 que está na parent class
        ChildClass2 childClass2 = new ChildClass2();
        childClass2.method2();
    }
    
}
