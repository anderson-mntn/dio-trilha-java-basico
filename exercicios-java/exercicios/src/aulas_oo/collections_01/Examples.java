package aulas_oo.collections_01;

import java.util.ArrayList;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        List <Double> grades = new ArrayList<>(); // Diamond operator
        grades.add(7.0);
        grades.add(10.0);
        grades.add(6.5);
        grades.add(5.0);
        grades.add(4.5);
        System.out.println(grades);
        System.out.println(grades.get(2));
    
    /*
     * toString()
     * indexOf() - int *position*
     * add() - add number "8" on 4th position: grades.add(4, 8d);
     * set() - replace the 5.0 grade to 9.0: grades.set(grades.indexOf(5d), 9.0);
     * contains() - check if contains the given number: returns a boolean. 
     * get(index) - returnts the value of given index
     * Collections.min():
     * - Returning the lowest grade using the Class Collections: Collections.min(grades); -> from interface Comparable<>
     * Collections.max() : Same as min.
     * ------------------------------------------
     * iterator()
     * - Get the sum of all values using iterantion:
     * 
     *   Iterator<Double> iterator = grades.iterator();
     *   Double sum = 0d; // to store the sum
     *   while(iterator.hasNext(){
     *      Double next = iterator.next();
     *      sum += next;
     *   }
     * iterator.next()
     * iterator.hasNext()
     * ------------------------------------------
     * size()
     * - Get the grade avarage:
     * (sum/grades.size());
     * ------------------------------------------
     * remove():
     * remove(0) - remove the index position
     * remove(10d) - remove value equals 10
     * ------------------------------------------
     * Removing grades bellow 7:
     * 
     *  Iterator<Double> iterator2 = grades.iterator();
     *  while(iterator2.nextNext()){
     *      Double next = iterator2.next();
     *      if(next < 7) iterator.remove();
     *  }
     * ------------------------------------------
     * clear() - Clear the list.
     * isEmpty() - verify if the list is empty
     */
    }
}
