public class MedianOfThree {
//---------------------------------------------------------------------------//
  public static int median(int a, int b, int c) {
    int[] array= new int[3];
    array[0]=a;
    array[1]=b;
    array[2]=c;
    if (a<b && b<c|| c<b && b<a) {
      return b;
    } // end of if
    else {
      for (int i=10;i > 0 ;i=i-1 ) {
        for (int n=2; n>0 ; n=n-1 ) {
          if (array[n]<array[n-1]) {
            int temp=array[n];
            array[n] = array[n-1];
            array[n-1] = temp;
          } // end of if
        } // end of for
      } // end of for
      return array[1];
    }
    
  }
  
//---------------------------------------------------------------------------//
  public static int median2(int a, int b, int c) {
    int median =0;
    
    if(a==b || a==c) {
      return a;
    }
    if(b==a || b==c) {
      return b;
    }
    if(c==a || c==b) {
      return c;
    }
    if(a==b && b==c) {
      return a;
    }
    
    if (a==b || a==c || b==c) {
      return median;
    } // end of if
    
    if (a<b && b<c) {
      median =b;
    } // end of if
    
    if (c<b && b<a) {
      median =b;
    } // end of if
    
    if (b<a && a<c) {
      median =a;
    } // end of if
    
    if (c<a && a<b) {
      median =a;
    } // end of if
    
    if (a<c && c<b) {
      median =c;
    } // end of if
    
    if (b<c && c<a) {
      median =c;
    } // end of if
    return median;
  }
  
//---------------------------------------------------------------------------//
  public static void main(String[] args) {
    int a= 559;
    int b= 298;
    int c= 428;
    int m= median(a, b, c);
    int m2= median2(a, b, c);
    System.out.println("Der Median ist "+m+"\nDer Median ist "+m2);
  }
}



