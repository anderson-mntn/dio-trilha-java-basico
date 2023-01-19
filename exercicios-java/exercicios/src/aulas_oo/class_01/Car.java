package aulas_oo.class_01;
/*
 * Learning Class in java
 */

class Car {
    // Attributes
    String color;
    String model;
    int manufactureYear;
    boolean sunroof;
    int gasCapacity;

    // Constructor
    Car(){

    }
    // Using overload
    Car(String color, String model, int gasCapacity){
        this.color = color;
        this.model = model;
        this.gasCapacity = gasCapacity;
        // "this" evita atribuir param a ele mesmo.
    }

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }

    void setModel(String model){
        this.model = model;
    }
    String getModel(){
        return model;
    }
    
    void setGasCapacity (int gasCapacity){ //Prestar atenção para get e set.
        this.gasCapacity = gasCapacity;
    }
    int getGasCapacity (){
        return gasCapacity;
    }

    double gasTankTotalValue(double gasValue){
        return gasCapacity * gasValue;
    }
    
    
}