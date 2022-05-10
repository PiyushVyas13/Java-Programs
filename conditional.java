class Conditional
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int greater = (num1>num2)?num1:num2;
		System.out.println("Greater is: "+greater);
	}
}