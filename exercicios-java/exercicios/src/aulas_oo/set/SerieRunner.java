package aulas_oo.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SerieRunner {
    public static void main(String[] args) {
        // - HashSet -
        Set<Serie> mySeries = new HashSet<>(){{  
            add(new Serie("Breaking Bad", "Drama", 50));
            add(new Serie("The Office", "Comedy", 40));
            add(new Serie("The Boys", "Action", 50));
        }};
        System.out.println(mySeries);

        // Ordering by gender (alphabetical) - TreeSet -
        Set<Serie> mySeries1 = new TreeSet<>(new ComparetorGender());
        mySeries1.addAll(mySeries);
        for (Serie serie : mySeries1) System.out.println(serie.getGender() + " - " + serie.getName() + " - " + serie.getEpMinutes());

    }
        
        
}
