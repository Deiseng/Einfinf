/**************************************
Fib1(5)= Fib1(4) + Fib1(3)
---------------------------------------------
  Fib1(4)=Fib1(3)+Fib1(2)
  Fib1(3)=Fib1(2)+Fib1(1)
---------------------------------------------
    Fib1(3)=Fib1(2)+Fib1(1)
    Fib1(2)=Fib1(1)+Fib1(0)
    Fib1(1)=1
---------------------------------------------
      Fib1(2)=Fib1(1)+Fib1(0)
      Fib1(1)=1
      Fib1(0)=1
---------------------------------------------
        Fib1(0)=1
  

***********************************************/
import java.math.*;
import java.math.BigInteger;

public class BigIntegerFibonacci {

  public static BigInteger fib1(int n){
    BigInteger fib= new BigInteger("0");
    if(n==0 || n==1) {
      return fib=BigInteger.ONE;
    }
    else {
      return fib1(n-2).add(fib1(n-1));
    }
    
    
  }

  public static BigInteger fib2(int n){
    BigInteger back= new BigInteger("0");
    BigInteger a= new BigInteger("0");
    BigInteger b= new BigInteger("0");
    BigInteger c= new BigInteger("0");
    int i=1;
    while(i<=n) {
      if(i==1) {
        a=a.add(BigInteger.ONE);
        b=b.add(BigInteger.ONE);
        back=a;
        i=i+1;
      }
      else if(i==2){     
        a=a.add(b);
        c=a.subtract(b);
        b=c;
        back=a;
        i=i+1;
      }
      else {
        c=a.add(b);
        b=c.subtract(b);
        a=c;
        back=c;
        i=i+1;
      } // end of if-else     
    }
    return back;
  }
  public static void main(String[] args) {
    BigInteger r= new BigInteger("0");
    String ausgabe ="";
    for(int i=0; i<=15; i++) {
      r=fib1(i);
      ausgabe = ausgabe + "["+(r.toString())+"]"; 
    }
    BigInteger s=fib2(7);
    System.out.println(ausgabe+"\n"+s.toString());
  }
}
