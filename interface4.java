interface Shape
{
	void area();
}
class Rectangle implements Shape
{
	int length, breadth;
	Rectangle(int l, int b)
	{
		length = l;
		breadth = b;
	}
	public void area()
	{
		System.out.println("Area of rectangle is: "+(length*breadth));
	}
}
class Circle implements Shape
{
	float pi = 3.14f;
	int radius;
	Circle(int r)
	{
		radius = r;
	}
	public void area()
	{
		System.out.println("Area of Circle is: "+(pi*(float)radius*(float)radius));
	}
}
class AreaMain
{
	public static void main(String args[])
	{
		Shape s = new Circle(5);
		Shape s1 = new Rectangle(5, 4);
		s.area();
		s1.area();
	}
}