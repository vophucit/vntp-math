package vntp.math.geometry;

import org.apache.log4j.Logger;

public abstract class Geometry
{
    //Static Variables
    private static Logger log = Logger.getLogger(Geometry.class);
	public abstract double getArea();
	public abstract double getPerimeter();
    
    public void print()
    {
        log.info(toString());
    }
    
    public static  void main(String[] agrs)
    {
            
        Circle circle1 = new Circle();
        circle1.print();
    }
}
