public class PerfectShuffle {
//---------------------------------------------------------------------------//
  public static int[] interleave(int[] a1, int[] a2) {
    int ausg[]= new int[(a1.length*2)];
    int j=0;
    for (int i=0;i<=ausg.length-1 ;i=i+2 ) {                
      ausg[i]= a1[j];
      j=j+1;
    } // end of for
    j=0;
    for (int h=1;h<ausg.length ;h=h+2 ) {
      ausg[h]=a2[j];
      j=j+1;
    } // end of for
    return ausg;
  }

//---------------------------------------------------------------------------//
  public static int[] perfectShuffle(int[] a) {
    if (a.length%2==1) {
      return a;
    } // end of if
    int h1[]=new int[(a.length/2)];
    int h2[]=new int[(a.length/2)];
    for(int i=0; i<(a.length/2); i=i+1) {
      h1[i]=a[i];
    }
    int i=0;
    for (int j=0+(a.length/2); j<a.length; j=j+1) {
      h2[i]=a[j];
      i=i+1;
    }
    int x[]= interleave(h1, h2);
    return x;
  }

//---------------------------------------------------------------------------//
  public static int shuffleNumber(int n) {
    if (n%2==1) {
      return n=-1;
    } // end of if
    if(n%2==1) {
      return n;
    }
    int a[]= new int[n];
    for(int i=0; i<a.length; i=i+1) {
      a[i]=i;
    }
    int b[]= a;
    int counter=1;
    a= perfectShuffle(a);
    while(true){
      a= perfectShuffle(a);
      counter=counter+1;
      if (java.util.Arrays.equals(a, b)) {
        break;
      } // end of if
    } // end of for    }
    return counter;
  }

//---------------------------------------------------------------------------//
  public static void main(String[] args) {
    int a1[]= {1,2,3};
    int a2[]= {4,5,6};
    int a3[]= {1, 2, 3, 4};
    int n=shuffleNumber(6);
    int ausg[]= interleave(a1, a2);
    int ausg2[]=perfectShuffle(a3);
    System.out.println(java.util.Arrays.toString(ausg)+"\n"+java.util.Arrays.toString(ausg2)+"\n"+n);
  }
}

