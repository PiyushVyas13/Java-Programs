interface Drawable
{
	void draw();
}
class TestInterface implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing...");
	}
	public static void main(String args[])
	{
		Drawable d = new TestInterface();
		d.draw();
	}
}
