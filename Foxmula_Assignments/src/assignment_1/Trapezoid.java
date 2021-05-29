package assignment_1;

public class Trapezoid extends Quadrilateral{
    private double height;
   
    public Trapezoid(SetCoordinates p1, SetCoordinates p2, SetCoordinates p3, SetCoordinates p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    public double Area(){
        double base = super.LengthOfTheSide();
        double area = base * this.height;

        return area;
    }
}