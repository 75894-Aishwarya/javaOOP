/*2. Circle -- x,y,radius
Concrete overriding Method --public double area() : ret area of circle
public String toString() : ret x, y & radius*/
public class Circle extends shape{
	
	private double radius;

	public Circle(double x, double y,double radius) {
		super(x, y);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	public double area() {
		double area=3.14*radius*radius;
		// TODO Auto-generated method stub
		return area;
	}
	
	public String tostring()
	{
		return "circle : "+super.tostring() + radius +" radius";
	}

}
