import java.util.*;

public class recursion {
    public static boolean[] maps = new boolean [26];
    public static void removeDuplicates(String str, int idx, String newString){
      if (idx == str.length()){
        System.out.println(newString);
        return;
      }
      
      char currChar = str.charAt(idx);
      if (maps[currChar-'a']){
        removeDuplicates(str,idx+1,newString);
      } else{
          newString += currChar;
          maps[currChar-'a'] = true;
          removeDuplicates(str,idx+1,newString);
      }
    }
    
    public static void main(String[] args){
      String str = "abbccda";
      removeDuplicates(str,0,"");
    }
}