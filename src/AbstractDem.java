abstract class Shape

{
	String objectName= " ";
	Shape(String name)
	{
		this.objectName=name;
		
	}
public void moveTo(int x, int y)
{
	System.out.println(this.objectName+ " "+"has been moved to" + " x=" +x+ " y=" +y);
}
//abstract methods will be implemented by its subclass(es)
	abstract public double area();
	abstract public void draw();
}
class Rectangle1 extends Shape
{
	int length, width;
	//constructor
	Rectangle1(int length, int width, String name)
	{
		super(name);
		this.length= length;
		this.width=width;
	}
public void draw()
{
	System.out.println("Rectangle has been drawn");
}
public double area()
{
	return (double)(length*width);
}
class Circle1 extends Shape
{
	double pi=3.14;
	int radius;
	
	Circle1(int radius, String name)
	{
		super(name);
		this.radius=radius;
	}
public void draw()
{
	System.out.println("circle has been drawn");
}
public double area()
{
	return(double)((pi*radius)/2);
}

}
}

public class AbstractDem {

	public static void main(String[] args) {
		// creating the object of rectangle class and using shape class reference
		Shape rect=new Rectangle1(2,3,"Rectangle");
		System.out.println("Area of rectangle" +rect.area());
		rect.moveTo(1, 2);
		System.out.println(" ");
		
		
		
		
		
	}

}
