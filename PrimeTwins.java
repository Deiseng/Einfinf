public class PrimeTwins {
//---------------------------------------------------------------------------//
  public static int[][] primeTwins(int number) {
    int a[][]= new int[number][2];
    if(number == 1){
      a[0][0]=3;
      a[0][1]=5;
      return a;
    }
    int p1=3;
    int p2=5;
    int counter=0;
    while(counter<=number-1) {
      if(primeNumber(p1)==true && primeNumber(p2)==true) {
        if(p2-p1==2) {
          a[counter][0]=p1;
          a[counter][1]=p2;
          counter= counter+1;
        }
      }
      p1=p1+2;
      p2=p2+2;
    }
    return a;
  }

  public static boolean primeNumber(long a) {
    for (long i = 2; i * i <= a; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
//---------------------------------------------------------------------------//
  public static void main(String[] args) {
    int a=100;
    int b[][]=primeTwins(a);
    System.out.println(java.util.Arrays.deepToString(b));
  }
}
