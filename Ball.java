public class Ball extends Present {
    private double radius = 1; // in meters

    Ball(double radius) {
        this.radius=radius;
    }

    public String toString(){
        return "Das Geschenk hat die Form eines Balls mit dem Radius "+this.radius+"m";
    }

    @Override
    public double surface() {
        double o=0;
        o=4*Math.PI*Math.pow(this.radius, 2);
        return o;
    }

}