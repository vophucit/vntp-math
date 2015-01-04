package vntp.math.geometry;

import org.apache.log4j.Logger;
import java.util.Scanner;

public class Parallelogram extends Geometry
{
    //Static Variables
    private static Logger log = Logger.getLogger(Parallelogram.class);
    
    //Class Variables
    private double LongSide;
    private double ShortSide;
    private double Height;
    
    //Default Constructor
    public Parallelogram()
    {
        this.LongSide = 0;
        this.ShortSide = 0;
        this.Height = 0;
    }
    public  Parallelogram(double longside, double shortside, double height)
    {
        this.LongSide = longside;
        this.ShortSide = shortside;
        this.Height = height;
    }
    
    //Methods
    public void setLongSide(double longside)
    {
        this.LongSide = longside;
    }
    public void setShortSide(double shortside)
    {
        this.ShortSide = shortside;
    }
    public void setHeight(double height)
    {
        this.Height = height;
    }
    private double getLongSide()
    {
        return this.LongSide;
    }
    private double getShortSide()
    {
        return this.ShortSide;
    }
    private double getHeight()
    {
        return this.Height;
    }
    
    public double getArea()
    {
        return getLongSide() * getHeight();
    }
    public double getPerimeter()
    {
        return (getLongSide() + getShortSide())*2;
    }
    
    public String toString()
    {
        String paraInfo ="";
        paraInfo += "\nPARALLELOGRAM";
        paraInfo += "\nLong Side: " + getLongSide();
        paraInfo += "\nShort Side: " + getShortSide();
        paraInfo += "\nHeight: " + getHeight();
        paraInfo += "\nArea: " + getArea();
        paraInfo += "\nPerimeter: " + getPerimeter() + "\n";
        return paraInfo;
    }
    public void print()
    {
        log.info(toString());
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double longSide;
        double shortSide;
        double height;
        
        Parallelogram para1 = new Parallelogram();
        para1.print();
        
        Parallelogram para2 = new Parallelogram(10, 5, 7);
        para2.print();
        
        Parallelogram para3 = new Parallelogram();
        log.info("Enter long side: ");
        longSide = sc.nextDouble();
        para3.setLongSide(longSide);
        
        log.info("Enter short side: ");
        shortSide = sc.nextDouble();
        para3.setShortSide(shortSide);
        
        log.info("Enter height: ");
        height = sc.nextDouble();
        para3.setHeight(height);
        
        para3.print();
        
    }
}
