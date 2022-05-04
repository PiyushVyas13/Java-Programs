interface Printable
{
	void print();
}
interface Showable
{
	void print();
}
class MultipleInheritance implements Printable, Showable
{
	public void print()
	{
		System.out.println("Printing...");
	}
	public static void main(String args[])
	{
		MultipleInheritance p = new MultipleInheritance();
		p.print();
	}
}