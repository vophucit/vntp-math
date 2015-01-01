package vntp.math.geometry;

public class Triangle
{
	//Class Variables
	private double Side1;
	private double Side2;
	private double Side3;
	
	//Default Constructor
	public Triangle()
	{
		this.Side1 = 0;
		this.Side2 = 0;
		this.Side3 = 0;
	}
	public Triangle(double side1,double side2, double side3)
	{
		this.Side1 = side1;
		this.Side2 = side2;
		this.Side3 = side3;
	}
	
	//Methods (functions)
	public void setSide1(double side1)
	{
		this.Side1 = side1;
	}
	public void setSide2(double side2)
	{
		this.Side2 = side2;
	}
	public void setSide3(double side3)
	{
		this.Side3 = side3;
	}
	private double getSide1()
	{
		return this.Side1;
	}
	private double getSide2()
	{
		return this.Side2;
	}
	private double getSide3()
	{
		return this.Side3;
	}
	
	private double getPerimeter()
	{
		return (this.Side1 + this.Side2 + this.Side3);
	}
	private double getArea()
	{ 
		double halfP = (this.Side1 + this.Side2 + this.Side3)/2;
		return Math.sqrt(halfP*(halfP-this.Side1)*(halfP-this.Side2)*(halfP-this.Side3));
	}
	
	public String toString()
	{
		String triInfo = "\nSide 1: " + getSide1();
		triInfo += "\nSide 2: " + getSide2();
		triInfo += "\nSide 3: " + getSide3();
		triInfo += "\nPerimeter: " + getPerimeter();
		triInfo += "\nArea: " + Math.round(getArea()*100)/100.0d + "\n";
		return triInfo;
	}
	
	public static void main(String[] agrs)
	{
		Triangle triangle1 = new Triangle();
		System.out.println(triangle1.toString());
		
		Triangle triangle2 = new Triangle(4,5,6);
		System.out.println(triangle2.toString());
		
		Triangle triangle3 = new Triangle();
		triangle3.setSide1(50);
		triangle3.setSide2(100);
		triangle3.setSide3(125);
		System.out.println(triangle3.toString());
	}
}