import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 digit number");
		int num = sc.nextInt();
		
		int unit, tens, hundreds;
		unit = num % 10;
		hundreds = num / 100;
		tens = (num-(hundreds*100+unit))/10;
		
		int reverse = unit*100+tens*10+hundreds;
		System.out.println("Reversed number is: "+reverse);
	}
}