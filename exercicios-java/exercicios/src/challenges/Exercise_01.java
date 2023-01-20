package challenges;
/*
 * Write the average temperature of 6 months of a city.
 * Calculate and show the month that temperature was above of the average and it's name.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise_01 {
    public static void main(String[] args) {
        List <Month> myMonths = new ArrayList<>(){{
            add(new Month("January", 30d));
            add(new Month("February", 25d));
            add(new Month("March", 27d));
            add(new Month("April", 20d));
            add(new Month("May", 22d));
            add(new Month("June", 15d));
        }};
        System.out.println(myMonths);
        
        //Calculating the average temperature 
        List <Double> temps = new ArrayList<Double>(){{
            add(30d);
            add(25d);
            add(27d);
            add(20d);
            add(22d);
            add(15d);
        }};

        Iterator<Double> iterator = temps.iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println("Temperature's average :" + sum / temps.size());
        
    }
}

class Month {
    private String name;
    private Double temperature;

    public Month(String name, Double temperature){
        this.name = name;
        this.temperature = temperature;
    }
    public String getName(){
        return name;
    }
    public Double getTemp(){
        return temperature;
    }
   
    public String toString(){
        return "{'"  + name +
        ", '" + temperature + "C'"  + 
        "}" ;

    }

}

