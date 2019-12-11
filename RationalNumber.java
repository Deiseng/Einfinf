import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.SQLOutput;
import java.sql.Types;

public class Food implements Comparable<Food> {

    private static final String[] TYPES = {"Apple", "Pear", "Cookie", "Grape"};
    String ftype;
    int fcal;

    public Food(String type, int calories) {
        for(int i= 0; i<TYPES.length; i++) {
            if (TYPES[i].equals(type)) {
                this.ftype = type;
                this.fcal = calories;
            }
        }

    }
    public String toString(){
        String back="";
        back= back+this.ftype+" "+this.fcal;
        return back;
    }
    public int compareTo(Food o) {
        int p1= this.ftype.length()*this.fcal;
        int p2= o.ftype.length()*o.fcal;
        if (p1<p2){
            return -1;
        }
        else if (p2<p1){
            return 1;
        }
        return 0;
    }

    public String getType() {
        return this.ftype;
    }

    public int getCalories() {
        return this.fcal;
    }

    public static Food[] createSortedRandomList(int n) {
        Food food[]= new Food[n];
        for(int i=0; i<food.length; i++){
            int trand= (int)(Math.random()*4);
            int calrand= (int)(Math.random()*1000);
            Food f= new Food(TYPES[trand], calrand );
            food[i]= f;
        }
        java.util.Arrays.sort(food);
        return food;
    }

    public static void main(String[] args) {
        Food a= new Food("Apples", 30);
        Food b= new Food("Pear", 500);
        //Food food[]= Food.createSortedRandomList(3);
        //System.out.println(java.util.Arrays.toString(food));
        System.out.println(a.compareTo(b));
    }

}

