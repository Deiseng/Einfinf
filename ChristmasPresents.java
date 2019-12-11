public class ChristmasPresents {

	public static void main(String[] args) {
	    Cylinder Weinflasche1= new Cylinder(3, 4);
	    Cylinder Weinflasche2= new Cylinder(4, 5);
	    Ball Geschenkkorb1= new Ball(10);
	    Ball Geschenkkorb2= new Ball(4);
	    Cylinder Gartenzwerg= new Cylinder(5, 6);
	    Cylinder Teddy= new Cylinder(7, 8);
	    Cuboid spiel1= new Cuboid(10, 10, 10);
	    Cuboid spiel2= new Cuboid(4, 5, 6);
	    Cuboid spiel3= new Cuboid(5, 6, 7);
	    String cylinder="Weinflasche 1: "+Weinflasche1.computePaperSize()+" "+Weinflasche1.computePaperSize()*2.7+"€"+
						"\nWeinflasche 1: "+Weinflasche2.computePaperSize()+" "+Weinflasche2.computePaperSize()*2.7+"€"+
						"\nGartenzwerg: "+Gartenzwerg.computePaperSize()+" "+Gartenzwerg.computePaperSize()*2.7+"€"+
						"\nTeddy: "+Teddy.computePaperSize()+" "+Teddy.computePaperSize()*2.7+"€";
	    String ball="Geschenkkorb 1:"+Geschenkkorb1.computePaperSize()+" "+Geschenkkorb1.computePaperSize()*2.7+"€"+
					"\nGeschenkkorb 2:"+Geschenkkorb2.computePaperSize()+" "+Geschenkkorb2.computePaperSize()*2.7+"€";
	    String cuboid="Spiel 1:"+spiel1.computePaperSize()+" "+spiel1.computePaperSize()*2.7+"€"+
				      "\nSpiel 2:"+spiel2.computePaperSize()+" "+spiel2.computePaperSize()*2.7+"€"+
				      "\nSpiel 1:"+spiel1.computePaperSize()+" "+spiel1.computePaperSize()*2.7+"€";

	    System.out.println(Geschenkkorb1.surface());
	}
}
