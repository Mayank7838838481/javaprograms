package string;

import java.util.Locale;

public class Stringmethod {
   static void main() {
      String s="mayank";
      String t="java pramming";
      String u="java pramming";
       String p="java pramming......................";
       String q="java pramming,,,,,,,";


     System.out.println(s.charAt(2));
       System.out.println(s.startsWith("M"));
       System.out.println(s.endsWith("k"));
       System.out.println(s.length());
       System.out.println(s.toLowerCase());
       System.out.println(s.toUpperCase(Locale.ROOT));
       System.out.println(t.equals(u));
       System.out.println(t.equalsIgnoreCase(u));
      
   }
}
