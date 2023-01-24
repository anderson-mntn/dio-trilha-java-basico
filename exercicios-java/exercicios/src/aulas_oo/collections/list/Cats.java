package aulas_oo.collections.list;

/*
 * Learning Collections methods and manipulatings
 * Cat 1 = name: Nick, Age: 7, Color: Black;
 * Cat 2 = name: Simba, Age: 2, Color: Orange;
 * Cat 1 = name: Nick, Age: 5, Color: Calico;
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cats {
    public static void main(String[] args) {
        List <Cat> myCats = new ArrayList<>(){{
            add(new Cat("Nick", 7, "Black"));
            add(new Cat("Simba", 2, "Orange"));
            add(new Cat("Nick", 5, "Calico"));
        }};

        // Collections Sorting
        // Insertion Order
        System.out.println("------------------");
        System.out.println(" Insertion Order" + myCats);
        System.out.println("------------------");

        // Random Order
        Collections.shuffle(myCats);
        System.out.println("Random Order: " + myCats);
        System.out.println("------------------");

        // Alphabetical Order (Name)
        // We need to implement the interface: "implements Comparable<Cat>" on "Cat", and the public int compareTo(Cat cat)
        // Then we use Collections.sort();
        Collections.sort(myCats);
        System.out.println("Alphabetical Order (Name): " + myCats);
        System.out.println("------------------");

        // Ascending Order (Age)
        // First look at "Comparator"
        //Collections.sort(myCats, new ComparatorAge());
        //Or: 
        myCats.sort(new ComparatorAge()); 
        System.out.println("Age Order: " + myCats);
        System.out.println("------------------");
        
        // Alphabetical Order (Color)
        Collections.sort(myCats, new ComparatorColor());
        System.out.println("Color Order: " + myCats);
        System.out.println("------------------");

        // Sorting cats by all properties - tiebreaker critery (Name-Age-Color)
        myCats.sort(new ComparatorAllProps());
        System.out.println("Sorting by All Properties: " + myCats);
        System.out.println("------------------");

    }
}

class Cat implements Comparable<Cat>{
    private String name;
    private Integer age;
    private String color;

    public Cat (String name, Integer age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
   public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "{" +
            "name:'" + name + '\'' +
            ", age: " + age +
            ", color: " + color + '\'' +
        "}";
    }

    @Override
    public int compareTo(Cat cat){
        return this.getName().compareToIgnoreCase(cat.getName()); // This comparation returns a int, -1, 0, 1.
    }        
}

class ComparatorAge implements Comparator<Cat>{ // class ComparatorAge with the interface passing the class Cat, allow us to acess the pros of Cat, ex: getAge();
    @Override
    public int compare(Cat c1, Cat c2) {
        return Integer.compare(c1.getAge(), c2.getAge()); // returns -1, 0 and 1.
    }
    // just need to use new ComparatorAge() on main, to sort it
}

class ComparatorColor implements Comparator<Cat>{
    @Override
    public int compare(Cat c1, Cat c2){
        return c1.getColor().compareToIgnoreCase(c2.getColor()); //Pass the values to be compared,  returns -1, 0 or 1 after the comparation.
    }  
}

class ComparatorAllProps implements Comparator<Cat>{
    @Override
    public int compare(Cat c1, Cat c2){
        int name = c1.getName().compareToIgnoreCase(c2.getName()); // Name is the first tiebreaker
        if (name != 0) return name;

        int color = c1.getColor().compareToIgnoreCase(c2.getColor()); // Color is the second tiebreaker
        if (color != 0) return color;

        return Integer.compare(c1.getAge(), c2.getAge()); // Age is the last tiebreaker
    }
}