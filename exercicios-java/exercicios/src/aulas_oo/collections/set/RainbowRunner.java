package aulas_oo.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class RainbowRunner {
    public static void main(String[] args) {
        Set<String> rainbow = new HashSet<>();
            rainbow.add("Vermelho"); 
            rainbow.add("Laranja"); 
            rainbow.add("Amarelo"); 
            rainbow.add("Verde"); 
            rainbow.add("Azul"); 
            rainbow.add("Anil"); 
            rainbow.add("Violeta"); 

        System.out.println("Tarefa 1: " + rainbow);
        System.out.println("Tarefa 2: " + rainbow.size() + " colors.");
        System.out.print("Tarefa 3: Ordem Alfabética"); 
        Set<String> rainbow3 = new TreeSet<>(rainbow);
        System.out.println(rainbow3);

        System.out.print("Tarefa 4 - Ordem Inversa de insersão: ");
        Set<String> rainbow4 = new LinkedHashSet<>( //preparar para mandar pra nova lista
            Arrays.asList("Violeta", "Anil", "Azul", "Verde","Amarelo","Laranja", "Vermelho")
        );
        List<String> rainbowRev = new ArrayList<>(rainbow4);
        Collections.reverse(rainbowRev); //Inverso em relação a lista "rainbow4"
        System.out.println(rainbowRev);

        System.out.print("Tarefa 5 - Printar cores que começam com a letra" + " v: ");
        for (String cor : rainbowRev) {
            if(cor.startsWith("V") || cor.startsWith("v")) System.out.print(cor + " - ");
        }
        System.out.println("\n");
        
        System.out.print("Tarefa 6 - Remover cores começam com a letra" + " v: ");
        Iterator<String> iterator2 = rainbow.iterator();
        while(iterator2.hasNext()) {
            if(iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(rainbow);

        System.out.print("Tarefa 7 - Limpando o conjunto: ");
        rainbow.clear();
        System.out.println(rainbow);




        // My solutions:
        // Set<Rainbow> rainbow3 = new TreeSet<>(new ComparatorColor());
        // rainbow3.addAll(rainbow);

        //System.out.println("Tarefa 3 - Ordem Alfabética : " + rainbow3);
        
        // Set<Rainbow> rainbow4 = new TreeSet<>(new ComparatorColorInverse());
        // rainbow4.addAll(rainbow);

        
        // System.out.println("Tarefa 5 - 'V' words ");
        // for (String color : rainbow) {
        //     if()
        // }
    }
    
}
