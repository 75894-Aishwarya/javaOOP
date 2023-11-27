/*4. Square-- x,y,side
Concrete overriding Method --public double area() : ret area of square
public String toString() : ret x, y , side*/
public class Square extends shape{
	private double side;
	public Square(double x, double y,double side) {
		super(x, y);
		this.side=side;
		
		// TODO Auto-generated constructor stub
	}

	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}
	
	public String tostring()
	{
		return "Square "+super.tostring()+" side "+side;
	}

}
