package challenges;

import java.util.Comparator;

/*
 * Usando Set, faça um conjunto contendo as cores do arco íris e faça:
 * 1 - Exiba todas as cores uma abaixo da outra
 * 2 - A Quantidade de cores
 * 3 - Exiba as cores em ordem alfabética
 * 4 - Exiba as cores na ordem inversa a que foram informadas
 * 5 - Exiba as cores que começam com a letra "v"
 * 6 - Remova todas as cores que não começam com "v"
 * 7 - Limpe o conjunto
 * 8 - Confira se o conjunto está vazio
 */
public class Rainbow {

    private String color;

    public Rainbow(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\n[color: " + color + "]" ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

// class ComparatorColor implements Comparator<Rainbow>{

//     @Override
//     public int compare(Rainbow o1, Rainbow o2) {
//         int color = o1.getColor().compareTo(o2.getColor());
//         if (color != 0) return color;
//         return -1;
//     }
// }

// class ComparatorColorInverse implements Comparator <Rainbow>{
//     @Override
//     public int compare(Rainbow o1, Rainbow o2) {
//     int color = o2.getColor().compareTo(o1.getColor());
//     if  (color != 0) return color;
//     return -1;
//     }
// }

