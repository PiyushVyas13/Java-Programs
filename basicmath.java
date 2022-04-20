class BasicMath
{
	public static void main(String args[])
	{
		int a = 10, b = 50;
		
		System.out.println("a+b: " + (a+b));
		System.out.println("a-b: " + (a-b));
		System.out.println("a*b: " + (a*b));
		System.out.println("a/b: " + (a/b));
		System.out.println("a%b: " + (a%b));
		
		int x = 42;
		double y = 42.25;
		
		System.out.println("x%10: " + (x%10));
		System.out.println("y%10: " + (y%10));
		
		a += 4;
		System.out.println("a: " + a);
		a %= 2;
		System.out.println("a: " + a);
		
		int c = 3;
		c  += 5+a;
		System.out.println("c: "+c);
		
		int p = 1, q = 2;
		int r, s;
		r = p++;
		s = --q;
		
		System.out.println("p: " + p);
		System.out.println("q: " + q);
		System.out.println("r: " + r);
		System.out.println("s: " + s);
	}
}