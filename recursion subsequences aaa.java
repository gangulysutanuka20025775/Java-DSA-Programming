import java.util.*;

public class recursion {
   public static void subsequences(String str, int idx, String newString,HashSet<String> set){
     if (idx == str.length()){
       if(set.contains(newString)){
       } else {
       System.out.println(newString);
       set.add(newString);
       return;
     }
     char currChar = str.charAt(idx);
     subsequences(str,idx+1,newString+currChar);
     subsequences(str,idx+1,newString);
   }
   
   public static void main (String [] args){
     String str = "aaa";
     HashSet<String> set = new HashSet<>();
     subsequences(str, 0, "",set);
   }
}