public class Cuboid extends Present {
    private double length = 1; // in meters
    private double width = 1; // in meters
    private double height = 1; // in meters

    Cuboid(double length, double width, double height) {
        this.length=length;
        this.width=width;
        this.height=height;
    }


    public String toString(){
        return "Das Geschenk hat die Form eines Quaders, welcher "+this.length+"m hoch, "+this.width+"m breit und "+this.height+"m hoch.";
    }

    @Override
    public double surface() {
        double o=0;
        o=2*((this.length*this.width)+(this.width*this.height)+(this.length*this.height));
        return o;
    }

}
