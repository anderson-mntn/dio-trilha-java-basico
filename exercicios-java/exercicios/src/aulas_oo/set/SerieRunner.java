package aulas_oo.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SerieRunner {
    public static void main(String[] args) {
        // - HashSet -
        Set<Serie> mySeries = new HashSet<>(){{  
            add(new Serie("The Boys", "Action", 50));
            add(new Serie("Peaky Blinder", "Drama", 55));
            add(new Serie("Breaking Bad", "Drama", 50));
            add(new Serie("The Office", "Comedy", 40));
        }};
        System.out.println(mySeries);

        //  - TreeSet -   Ordering by gender (alphabetical), could be ordered by time(importar Compareble, com epMinutes, mas se tiver 2 valores iguais tem que fazer critério de desempate)
        Set<Serie> mySeries1 = new TreeSet<>(new ComparetorGender());
        System.out.println("--- Order By Gender ---");
        mySeries1.addAll(mySeries);
        for (Serie serie : mySeries1) System.out.println(serie.getGender() + " - " + serie.getName() + " - " + serie.getEpMinutes());

        Set<Serie> mySeries2 = new TreeSet<>(new ComparetorDuration());
        System.out.println("--- Order Ep Duration ---");
        mySeries2.addAll(mySeries);
        for (Serie serie : mySeries2) System.out.println(serie.getEpMinutes() + " - " + serie.getName() + " - " + serie.getGender());

    }
        
        
}
