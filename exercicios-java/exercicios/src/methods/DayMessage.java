package methods;

public class DayMessage {
        public static void getMessage(int hour){
            
            switch(hour){
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    goodMorningMessage(hour); //We can usa methods inside methods.
                    break;
                case 13 :
                case 14 :
                case 15 :
                case 16 :
                case 17 :
                    goodEveningMessage(hour);
                    break;
                case 18:    
                case 19:    
                case 20:    
                case 21:    
                case 22:    
                case 23:    
                case 24:
                    goodNightMessage(hour);
                    break;    
                case 0:    
                case 1:    
                case 2:    
                case 3:
                case 4: 
                    goodNightAMMsg(hour);
                    break;
                default:
                    System.out.println("Invalid Hour.");  
                    break;
            }
        
           
        };
        public static void goodMorningMessage(int hour) {
            System.out.println("Good Morning! It's: " + hour + " AM.");
        }
        
        public static void goodEveningMessage(int hour) {
            System.out.println("Good Evening! It's: " + hour + " PM.");
        }
        
        public static void goodNightMessage(int hour) {
            System.out.println("Good Night! It's: " + hour + " PM.");
        }
        public static void goodNightAMMsg(int hour) {
            System.out.println("Good Night! It's: " + hour + " AM.");
        }
}
