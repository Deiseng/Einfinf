public class RandomIntArrayEclipse {
      //---------------------------------------------------------------------------//
  public static int[] createRandom(int n) {
    int a[] = new int[n];
    int maxrand=99;
    int min=5;
    for(int i=0; i<a.length; i=i+1 ) {
      a[i]=(int)(min+Math.random()*((maxrand-min)+1));
    }
    return a;
  }

      //---------------------------------------------------------------------------//
  public static String toString(int[] a) {
    String ausg="";
    for(int i=0; i<a.length; i=i+1) {
      ausg= ausg+"["+a[i]+"]";
    }
    return ausg;
  }

      //---------------------------------------------------------------------------//
  public static int posMin(int[] a) {
    int temp=0;
    for(int i=0; i<a.length-1; i=i+1) {
      int y=a[i+1];
      if(i+1==a.length){
        return temp;
      }
      if(a[temp]==y) {
        i=i+1; 
      }
      if(a[temp]>y) {
        temp=i+1;
      }
    }
    return temp;
  }

      //---------------------------------------------------------------------------//
  public static String swap(int[] a) {
    String x= java.util.Arrays.toString(a);
    int temp=0;
    temp =a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=temp;
    String y= x+"\n"+java.util.Arrays.toString(a);
    return y;
  }
        
  public static void main(String args[]) {
    int n=10;
    int a[]=createRandom(n);
    String test=toString(a);
    int b=posMin(a);
    //System.out.println(test+"\n"+java.util.Arrays.toString(a)+"\nDie Position der kleinsten Zahl ist "+b);
    System.out.println(swap(a));
  }
}   
