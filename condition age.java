

import java.util.*;

public class condition {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        if(age>18){
          System.out.print("Adualt");
        } else {
          System.out.print("Not Adualt");
        }
    }
}