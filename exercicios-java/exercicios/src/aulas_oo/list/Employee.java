package aulas_oo.list;
/*
 * Make a program to store 3 employee's attributes and send it to an array. 
 * 1 - if the id has already been registred, abort the register show a message informing it.
 * 2 - make a function that give a salary raise of 10% for employee (passing it's id): "increaseSalary()".
 */
public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){

    }

    public Employee(Integer id, String name, Double salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }   

    // Increase Salary
    public void increaseSalary(Double percentage){
        salary += salary * percentage / 100.0; // this.salary optional
    }
    
    public String toString(){
        return id + ", " + name + ", " + "Salary: " + String.format("%.2f", salary);
    }
    
}
