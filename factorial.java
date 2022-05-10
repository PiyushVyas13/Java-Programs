import java.util.Scanner;
class Factorial
{
	static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		System.out.println("Factorial is: "+fact(num));
	}
}