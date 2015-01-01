package vntp.math.geometry;

public class Rectangle
{
	//Class Variables
	private double LongSide;
	private double ShortSide;
	
	//Default Constructor
	public Rectangle()
	{
		this.LongSide = 0;
		this.ShortSide = 0;
	}
	public Rectangle(double longside, double shortside)
	{
		this.LongSide = longside;
		this.ShortSide = shortside;
	}
	//Methods (funtions)
	public void setLongSide(double longside)
	{
		this.LongSide = longside;
	}
	public void setShortSide(double shortside)
	{
		this.ShortSide = shortside;
	}
	private double getLongSide()
	{
		return this.LongSide;
	}
	private double getShortSide()
	{
		return this.ShortSide;
	}
	
	private double getArea()
	{
		return (this.LongSide * this.ShortSide);
	}
	private double getPerimeter()
	{
		return (this.LongSide + this.ShortSide);
	}
	
	public String toString()
	{
		String recInfo = "\nLong Side: " + getLongSide();
		recInfo += "\nShort Side: " + getShortSide();
		recInfo += "\nArea: " + getArea();
		recInfo += "\nPerimeter: " + getPerimeter() + "\n";
		return recInfo;
	}
	
	public static void main(String[] agrs)
	{
		Rectangle rectangle1 = new Rectangle();
		System.out.println(rectangle1.toString());
		
		Rectangle rectangle2 = new Rectangle(20,10);
		System.out.println(rectangle2.toString());
		
		Rectangle rectangle3 = new Rectangle();
		rectangle3.setLongSide(50);
		rectangle3.setShortSide(30);
		System.out.println(rectangle3.toString());
	}
}