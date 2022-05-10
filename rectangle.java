import java.util.Scanner;
class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int l, int b)
	{
		length=l;
		breadth=b;
	}
	
	int rect_area()
	{
		int area = length*breadth;
		return area;
	}
	
	int perimeter()
	{
		int peri = 2 * (length+breadth);
		return peri;
	}
}
class RectArea
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int length = sc.nextInt();
		System.out.print("Enter the breadth: ");
		int breadth = sc.nextInt();
		Rectangle rect = new Rectangle(length, breadth);
		
		System.out.println("Area of rectangle is: "+rect.rect_area());
		System.out.println("Perimeter of rectangle is: "+rect.perimeter());
	}
}