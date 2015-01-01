package vntp.math.geometry;

public class Circle
{
	//Class Variables
	private double Radius;
	
	//Default Constructor
	public Circle()
	{
		this.Radius = 0.0;
	}
	public Circle(double radius)
	{
		this.Radius = radius;
	}
	
	//Methods (functions)
	public void setRadius(double radius)
	{
		this.Radius = radius;
	}
	private double getRadius()
	{
		return this.Radius;
	}
	
	private double getPerimeter()
	{
		return this.Radius * 2 * 3.14;
	}
	private double getArea()
	{
		return Math.pow(this.Radius,2) * 3.14;
	}
	public String toString()
	{
		String circleInfo = "";
		circleInfo += "\nRadius: " + getRadius();
		circleInfo += "\nPerimeter: " + Math.round(getPerimeter() * 100)/100.0d;
		circleInfo += "\nArea: " + Math.round(getArea() * 100)/100.0d + "\n";
		
		circleInfo += String.format("\nRadius: %.2f", getRadius());
		circleInfo += String.format("\nPerimeter: %.2f", getPerimeter());
		
		
		return circleInfo;
	}
	
	public static void main(String[] agrs)
	{
		Circle circle1 = new Circle();
		System.out.println(circle1.toString());
		
		Circle circle2 = new Circle(10);
		System.out.println(circle2.toString());
		
		Circle circle3 = new Circle();
		circle3.setRadius(7);
		System.out.println(circle3.toString());
	}
	
}