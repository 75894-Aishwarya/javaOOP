/*Solve assignment (to understand abstraction)
1. Create abstract class Shape --state :  x,y 
Abstract Method --public double area();
public String toString() : to ret x & y*/
public abstract class shape {
	
	protected double x,y;
	
	public shape(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public abstract double area();
	
	
	public String tostring()
	{
		return "x "+x+" y "+y;
	}

}
