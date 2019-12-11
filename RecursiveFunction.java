//package b033.RecurcisveFunction.templates;

/**************************************
Die Funktion beschreibt, welchen Wert x besitzt, wenn y 0 erreicht. 
Betrachtet man nun also eine Funktion, dann rechnet sie die Nullstelle aus.

***********************************************/
public class RecursiveFunction {

  public static int rec(int x, int y) {
    if(y==0) {
      return x;
    }
    if(y!=0) {
      x=x-y;
      y=y-y;
      return x;
    }
    return x;
    
  }

  public static int iter(int x, int y) {
    if(y==0) {
      return x;
    }
    int temp1= y;
    for(int i=0; i<temp1; i=i+1) {
      x=x-1;
      y=y-1;
    }
    return x;
    
  }
  
  public static void main(String[] args) {
    int x=10;
    int y=4;
    System.out.println(rec(x, y)+" "+iter(x,y));
    
  }
}
