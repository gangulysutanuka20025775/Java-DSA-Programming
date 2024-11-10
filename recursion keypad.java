import java.util.*;

public class recursion {
   public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
   
   public static void printcomb(String str, int idx, String comb){
     if (idx == str.length()){
       System.out.println(comb);
       return;
     }
     char currChar = str.charAt(idx);
     String map = keypad[currChar - '0'];
     
     for( int i=0; i<map.length(); i++){
       printcomb(str, idx+1, comb+map.charAt(i));
     }
   }
   
   public static void main(String [] args){
     String str = "23";
     printcomb(str, 0, "");
   }
}
