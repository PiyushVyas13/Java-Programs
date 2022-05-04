interface Printable
{
	void print();
	interface Showable
	{
		void msg();
	}
}
class NestedInterface implements Printable.Showable, Printable
{
	public void msg()
	{
		System.out.println("Messaging");
	}
	public void print()
	{
		System.out.println("Printing...");
	}
	public static void main(String args[])
	{
		Printable.Showable s = new NestedInterface();
		Printable p = new NestedInterface();
		s.msg();
		p.print();
	}
}