public class TernarySearch {
    static final int UNDEF = -1;
    static int bcounter = 0;
    static int tcounter = 0;

    public static int find(int[] a, int x) {
        return _find(a, 0, a.length - 1, x);
    }

    private static int _find(int[] a, int l, int r, int x) {
        bcounter++;
        if (l > r) return UNDEF;
        int m = (l + r) / 2;
        if (x == a[m]) return m;
        else if (x < a[m]) return _find(a, l, m - 1, x);
        else return _find(a, m + 1, r, x);
    }

    public static int ternaryRec(int a[], int x) {
       if (x<a[0]){
           return UNDEF;
       }
       else if(x>a[a.length-1]){
           return UNDEF;
       }
       else{
          return _find2(a, 0, a.length-1, x);
       }
    }

    public static int _find2(int a[], int l, int r, int x) {
        tcounter++;
        if (x==a[l]){
            return l;
        }
        else if (x==a[r]){
            return r;
        }
        else if (x==a[a.length/3]){
            return x/3;
        }
        else if (x==a[(a.length/3)*2]){
            return ((a.length/3)*2);
        }
        else if (r-l==0){
            return UNDEF;
        }
        if (x<a[r/3]){
            return _find2(a, 0, r/3, x);
        }
        else if (x>a[(r/3)*2]){
            return _find2(a, (r/3)*2, r-1, x);
        }
        else{
            return _find2(a, r/3, (r/3)*2, x);
        }
    }
        public static void main (String[]args){
        int a[]= {2, 4, 6, 8, 10, 12};
        int b=ternaryRec(a, 10);
            System.out.println(b);

        }

    }
