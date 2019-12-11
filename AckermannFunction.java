/**************************************
in diesem Kommentar bitte Antwort zu Teil (2) und (3) einfuegen

***********************************************/
import java.math.BigInteger;

public class AckermannFunction {
  public static BigInteger ackermann(BigInteger x, BigInteger y){
    int cntrl1=Integer.parseInt(x.toString());
    int cntrl2=Integer.parseInt(y.toString());
    BigInteger zero= new BigInteger("0");
    BigInteger one= new BigInteger("1");
    BigInteger two= new BigInteger("2");
    if(y.equals(zero)==true) {
      return zero;
    }
    else if(x.equals(zero)==true) {
      return y=y.multiply(two);
    }
    else if(y.equals(one)==true) {
      return two;   
    }
    else{
      return ackermann(x.subtract(one), ackermann(x, y.subtract(one))); 
    }
  }
   
  public static void main(String[] args) {
    BigInteger x=new BigInteger("1");
    BigInteger y= new BigInteger("10");
    System.out.println(ackermann(x, y).toString());
  }
}
