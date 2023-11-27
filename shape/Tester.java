//5. Create a Tester class :test all shape classes
public class Tester {
	
	public static void main(String[] args)
	{
		Circle c1=new Circle(2,5,4);
		System.out.println(c1.tostring());
        System.out.println("Area of Circle: " + c1.area());
        
        Rectangle r1=new Rectangle(2,5,4,5);
		System.out.println(r1.tostring());
        System.out.println("Area of Circle: " + r1.area());
        
        Square s1=new Square(2,5,4);
		System.out.println(s1.tostring());
        System.out.println("Area of Circle: " + s1.area());
        
	}

}
