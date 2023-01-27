package challenges;

public class Tests {
    public static void main(String[] args) {
    System.out.println(TestStatic.missingChar("kitten", 3));
    }
      
}

class TestStatic {
    // missingChar
    /*
     * Given a non-empty string and an int n, return a new string
     *  where the char at index n has been removed.
     *  The value of n will be a valid index of a char in the original string 
     * (i.e. n will be in the range 0..str.length()-1 inclusive).
     */
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        
        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.

        String back = str.substring(n+1, str.length());
        
        return front + back;
      }

      // notString
      public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
          return str;
        }
        
        return "not " + str;
      }
}