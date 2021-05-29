package assignment_1;

public class Quadrilateral {
	
	private SetCoordinates p1, p2, p3, p4;

    public Quadrilateral(SetCoordinates p1, SetCoordinates p2, SetCoordinates p3, SetCoordinates p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double LengthOfTheSide(){
        double length = Math.sqrt(((this.p1.getX() - this.p2.getX()) 
        				* (this.p1.getX() - this.p2.getX())) 
        				+ ((this.p1.getY() - this.p2.getY()) 
        				* (this.p1.getY() - this.p2.getY())));

        return length;
    }
}