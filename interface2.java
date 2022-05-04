interface NewShape
{
	void draw();
}
interface Circle extends NewShape
{
	void getRadius();
	int radius = 10;
} 
class NewCircle implements Circle
{
	public void getRadius()
	{
		System.out.println(radius);
	}
	// Code Correction
	public void draw()
	{
		System.out.println("Drawing..");
	}
}
class ExtendInterface
{
	public static void main(String args[])
	{
		Circle nc = new NewCircle();
		nc.getRadius();
	}
}