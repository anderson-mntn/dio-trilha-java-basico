package aulas_oo.class_01;

public class RodarAplicação {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        // ---- Car 1 ----
        System.out.println("---- Car 1 ----");
        car1.setColor("Red"); //Setting color for blue
        car1.setModel("Mustang");
        car1.setGasCapacity(50);
    
        System.out.println("Car 1:");
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getGasCapacity());
        System.out.println("Money amount to fill the gas tank: " + car1.gasTankTotalValue(5.50) + "$");

        // ---- Car 2 ----
        car2.setColor("Blue");
        car2.setModel("Ferrari");
        car2.setGasCapacity(40);

        System.out.println("---- Car 2 ----");
        System.out.println(car2.getColor());
        System.out.println(car2.getModel());
        System.out.println(car2.gasCapacity); 
        System.out.println("Money amount to fill the gas tank: " + car2.gasTankTotalValue(5.50) + "$");  
    }
}
