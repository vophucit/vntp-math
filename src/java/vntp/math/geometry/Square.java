package vntp.math.geometry;

public class Square
{
	//Class Variables
	private double Side;
	
	//Default Constructor
	public Square()
	{
		this.Side = 0;
	}
	public Square(double side)
	{
		this.Side = side;
	}
	
	//Methods
	public void setSide(double side)
	{
		this.Side = side;
	}
	private double getSide()
	{
		return this.Side;
	}
	
	private double getPerimeter()
	{
		return this.Side * 4;
	}
	private double getArea()
	{
		return Math.pow(this.Side,2);
	}
	public String toString()
	{
		String squareInfo = "\nSide: " + getSide();
		squareInfo += "\nPerimeter: " + getPerimeter();
		squareInfo += "\nArea: " + getArea() + "\n";
		return squareInfo;
	}
	
	public static void main(String[] agrs)
	{
		Square square1 = new Square();
		System.out.println(square1.toString());
		
		Square square2 = new Square(10);
		System.out.println(square2.toString());
		
		Square square3 = new Square();
		square3.setSide(20);
		System.out.println(square3.toString());
	}
}