package aulas_oo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeRunner extends Employee{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        System.out.println();
        int N = scan.nextInt();
        
        List<Employee> list = new ArrayList<>();  //List<tipo do objeto> lista = ... ; E Instânciar com "new Arrayli"
        
        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.println("Id: ");
            Integer id = scan.nextInt(); //Enter gera quebra de linha no buffer de entrada
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try another id: ");
                id = scan.nextInt();
            }


            System.out.println("Name: ");
            scan.nextLine(); // Feito para limpa buffer de entrada para não consumir o enter no scan anterior
            String name = scan.nextLine();
            
            System.out.println("Salary: ");
            Double salary = scan.nextDouble();

            Employee emp = new Employee(id, name, salary); // Instancing employee
            list.add(emp); // Putting instantiated employee in the list

        }

         // Giving salary raise for id passed
         System.out.println("Enter the employee's id that will have salary increased: ");
         int idSalary = scan.nextInt();
         Integer pos = idPosition(list, idSalary);

         /*
          * Lambda expression - Other way to get the id position:
          * Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
          * Trade: if(pos == null)
          */

         if(pos == -1){
             System.out.println("Id not registered");
         } else {
            System.out.println("Enter the raise percertage: ");
             double percent = scan.nextInt();
             list.get(pos).increaseSalary(percent);
             System.out.println("Employee " + list.get(pos).getName() + " new salary is: " + list.get(pos).getSalary());
         }
        
        //Criar toString no employee para printar a lista de employees
        System.out.println("List of Employees: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        scan.close();
    }

    // Função Auxiliar para procurar elemento (id) na lista e retornar seu index.

    public static int idPosition(List<Employee> list, int id){ // "List<Employee> list" é outra lista diferente da primeira feita, pois está em um escopo diferente. Deve ser static pq vai dentro de outra static.
        for ( int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){ // .get() pega um elemento na posição
                return i;
            }
        }
        return -1; // or "return null;" or whatever it needs.
    }

    // Checking if the id is already registered
    public static boolean hasId (List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null; // return true if id  was found
    }

}
