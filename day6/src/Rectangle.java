/*3. Rectangle -- x,y,w,h
Concrete overriding Method --public double area() : ret area of rectangle
public String toString() : ret x, y , width & height*/
public class Rectangle extends shape{
	private double width;
	private double height;
	
	public Rectangle(double x, double y,double width,double height) {
		super(x, y);
		this.width=width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	public double area() {
		// TODO Auto-generated method stub
		
		double area=width*height;
		return area;
	}
	
	
	public String tostring()
	{
		return "Rectangle : "+super.tostring()+" width "+width+" height "+height;
	}
	
	
	

}
