import java.util.Scanner;
class BinToDec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		String binary = sc.next();
		int dec = Integer.parseInt(binary, 2);
		String oct = Integer.toOctalString(dec);
		String hex = Integer.toHexString(dec);
		System.out.println("Decimal is: "+dec);
		System.out.println("Octal is: "+oct);
		System.out.println("Hexadecimal is: "+hex);
	}
}