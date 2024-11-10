import java.util.*;

public class Factorial {
  public static int calpow(int x, int n){
    if(n==0){
      return 1;
    }
    if (x==0){
      return 0;
    }
    int xpownm1 = calpow(x,n-1);
    int xpown = x * xpownm1;
    return xpown;
  }
  public static void main (String [] args){
    int x=2, n=5;
    int ans = calpow(x,n);
    System.out.println(ans);
  }
}