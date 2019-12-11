import java.math.BigInteger;
import java.util.Arrays;

public class RecursiveFunction2 {
  public static int marge(int n) {
    if(n==0) {
      return 1;
    }
    else {
      return n-(homer(marge(n-1)));
    }
  }

  public static int homer(int n) {
    if(n==0) {
      return 0;
    }
    else {
      return n- (marge(homer(n-1)));
    }
  }

  public static boolean dispute(int n) {
    if(marge(n)==homer(n)){
      return false; 
    }
    return true;
  }

  public static int[] differenceDisputes(int x) {
    int streit[]= new int[x];
    int a=0;
    int b=0;
    int c=0;
    int i=0;
    while(i<streit.length) {
      if(i<=1) {
        streit[i]=marge(i);
        i=i+1;
      }
      else if(i==2){  
        a=marge(i)-homer(i);
        b=homer(i);
        streit[i]=a;
        i++;
      }
      else {
        c=a+b;
        streit[i]=c;
        a= marge(i)-homer(i);
        b= a-homer(i);
        i++;
        
      }
    }
    return streit;
  }

  public static void main(String args[]) {
    String ausg="";
    int a[]= differenceDisputes(12);
    boolean copper= dispute(7);
    boolean silver= dispute(25);
    ausg=Arrays.toString(a)+"\n";
    if(copper=false) {
      ausg=ausg+"\nDie kupferne Hochzeit findet nicht im Streit statt \n";
    }
    else {
      ausg=ausg+"\nDie kupferne Hochzeit findet im Streit statt \n";   
    }
    if(silver=false) {
      ausg=ausg+"Die silberne Hochzeit findet nicht im Streit statt";
      
    }
    else {
      ausg=ausg+"Die silberne Hochzeit findet im Streit statt";
    }
    System.out.println(ausg);
  }
}
