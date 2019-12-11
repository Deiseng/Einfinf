import java.awt.desktop.SystemSleepEvent;

public class Clock {
  private int h;
  private int min;
  public int getMin() {
    return min;
  }
  public int getH() {
    return h;
  }


  public Clock(int hour, int min){
    this.min= min;
    this.h= hour;
    while (true){
      if (this.h>23){
        this.h=this.h-24;
      }
      else{
        break;
      }
    }
  }


  public Clock(int min){
    while(true) {
      if (min>59) {
        this.h=this.h+1;
        min=min-60;
      }
      else{
        this.min=min;
      }
      if(this.min==min){
        break;
      }
    }
  }


  public Clock(String a){
    String [] x=a.split(":");
    int hour= Integer.parseInt(x[0]);
    int minute= Integer.parseInt(x[1]);
    this.h= hour;
    this.min= minute;
  }


  public Clock add(int min) {
    Clock erg= new Clock(0,min);
    erg.h= this.h;
    erg.min= erg.min+this.min;
    while(true) {
      if (erg.min > 59) {
        erg.h = erg.h + 1;
        erg.min = erg.min - 60;
      } else {
        break;
      }
    }
    return erg;
  }


  public Clock add(Clock c) {
    Clock erg= new Clock(0, 0);
    
    erg.h=this.h+c.h;
    if(erg.h>23){
      erg.h=erg.h-24;
    }
    erg.min=this.min+c.min;
    if (erg.min>=60){
      erg.h=erg.h+1;
      erg.min=erg.min-60;
    }
    
    return erg;
  }

  public String toString() {
    String min= ""+this.min;
    String h= ""+this.h;
    String ausg=h+":"+min;
    return ausg;
  }


  public static void main(String[] args) {
    Clock a= new Clock( 0, 46);
    a=a.add(30);
    System.out.println(a.toString());
  }
}
