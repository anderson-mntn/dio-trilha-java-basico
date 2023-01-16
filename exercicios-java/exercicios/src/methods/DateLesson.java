package methods;

import java.util.Calendar;

public class DateLesson {
    public static void main(String[] args) {

    //    Date data = new Date();
    //    System.out.println(data);
    
    Calendar c = Calendar.getInstance(); //Usada em datas
    /*
    É possível manipular/obter data e hora com os métodos fornecidos
    Ex: c.get(Calendar.MONTH)
    Ex: c.get(Calendar.YEAR)
    Ex: c.get(Calendar.DAY_OF_THE_MONTH)
    Ex: c.get(Calendar.HOUR_OF_DAY)
    */
    System.out.println("Data e Hora atual: " + c.getTime());
    System.out.println("Month: " + c.get(Calendar.MONTH) + 1);
    System.out.println("Year: " + c.get(Calendar.YEAR));
    System.out.println("Hour: " + c.get(Calendar.HOUR_OF_DAY));
    
    
    
    /* 
    Date data = c.getTime();

    Convertendo date para String 
    DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); Full date
    DateFormat.getDateInstance(DateFormat.LONG); / MEDIUM / SHORT  
     sout(f.format(data));

    String to date -> f.parse / class: SimpleDateFormat (Permite passar como argumento o formato da data desejada)
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sout(sdf.format(data))
    */

    //Formating date based on country:
    //Locale USA = Locale.US;
    //Locale italy =  Locale.ITALIAN;
    //--
    //DateFormatf2 = DateFormat.getGatInstance(DateFormat.FULL, brasil);
    
    }
    
}
