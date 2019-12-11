import java.sql.SQLOutput;
import java.util.Arrays;

public class Polynomial {
    private int degree; // highest power of x
    private double[] coeffs; // Array with coefficients, all coefficients [0..degree] are necessary

    public Polynomial(double[] c) {
        this.coeffs=c;
        this.degree=coeffs.length-1;
        int i=coeffs.length-1;
        while(true){
            if (this.coeffs[i]==0){
                this.degree=this.degree-1;
                i--;
            }
            else if(i<0){
                break;
            }
            else{
                break;
            }
        }
    }

    public int getDegree(){
        return this.degree;
    }

    public double[] getAllCoefficients(){
        return this.coeffs;

    }

    public double getCoefficient(int i){
        return this.coeffs[i];
    }

    public String toString() {
        String back="";
        for(int i=0; i<coeffs.length; i++){
            if(i==0){
                back=back+coeffs[0]+"+";
            }
            else if(i==1){
                back=back+coeffs[1]+"*x";
            }
            else {
                back = back +"+"+ coeffs[i] + "*x^" + i;
            }
        }
        return back;

    }

    public double evaluate(double x) {
        double a=0;
        double nx=0;
        double temp;
        a=this.coeffs[0];
        for(int i=1; i<this.coeffs.length; i++){
            temp=0;
            nx=x;
            int count=1;
            while(count<i){
                nx=nx*x;
                count++;
            }
            temp=this.coeffs[i]*nx;
            a=a+temp;
        }
        return a;
    }

    public Polynomial differentiate() {
        double ncoeffs[] = new double[this.coeffs.length-1];
        for(int i=0; i<ncoeffs.length; i++){
            ncoeffs[i]=this.coeffs[i+1]*(i+1);
        }
        Polynomial diff = new Polynomial(ncoeffs);
        return diff;
    }

    public static void main(String[] args) {
        double test[]= new double[4];
        for(int i=0; i<test.length; i++){
            int rand= (int)(Math.random()*11);
            test[i]=rand;
        }
        Polynomial p= new Polynomial(test);
        System.out.println(Arrays.toString(p.getAllCoefficients())+"\n"+p.toString()+"\n"+p.evaluate(3)+"\n"+p.differentiate());

    }
}