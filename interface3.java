interface Pet
{
	public void test();
}
class Dog implements Pet
{
	public void test()
	{
		System.out.println("Interface method implemented");
	}
	public static void main(String args[])
	{
		Pet p = new Dog();
		p.test();
	}
}