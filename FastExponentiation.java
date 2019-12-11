/********************************************************
 x=2, n=13
 2*2^n-1 ---> 2*2^12--->
 (2*2)^12/2 ---> (4)^6 --->
 (4*4)^6/2 ---> 16^3 --->
 16*16^2 ---> 16^2= 256 ---> 256*16=4096 --->4096*2=8192
 ********************************************************/

public class FastExponentiation {
    private static int rcount=0;
    private static int icount;
    public static double fastPotRek(double x, int n){
        rcount++;
        if (n==0){
            return 1;
        }
        if (n==1){
            return x;
        }
        if (n%2==0){
            return fastPotRek(x*x, n/2);
        }
        else{
            x=x*fastPotRek(x, n-1);
            return x;
        }
    }

    public static double fastPotIter(double x, int n){
        double temp=1;
        icount=0;
        while(n>1){
            icount++;
            if (n%2==0){
                x=x*x;
                n=n/2;
            }
            else{
                n=n-1;
                temp=temp*x;
            }
        }
        x=x*temp;
        return x;
    }

    public static void main(String[] args) {
        double a=7;
        int b=57;
        double c= fastPotIter(a, b);
        double d= fastPotRek(a,b);
        System.out.println(c+"\n"+d+"\n"+icount+"\n"+rcount);

    }
}