public class Cylinder extends Present {
    private double height = 1; // in meters
    private double radius = 1; // in meters

    Cylinder(double height, double radius) {
        this.height=height;
        this.radius=radius;
    }
	
    public String toString(){
        return "Der Zylinder ist "+this.height+"m hoch und hat den Radius "+this.radius+"m";
    }
    
    @Override
    public double surface() {
        double a=0;
        a=2*Math.PI*this.radius*(this.radius+this.height);
        return a;

    }
}
