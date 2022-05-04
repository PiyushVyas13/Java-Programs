interface Printable
{
	default void print()
	{
		System.out.println("Printing...");
	}
	static void show()
	{
		System.out.println("Showing...");
	}
}
class DefaultDemo implements Printable
{
	
	public static void main(String args[])
	{
		Printable p = new DefaultDemo();
		p.print();
		Printable.show();
	}
}