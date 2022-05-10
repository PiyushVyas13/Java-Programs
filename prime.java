class Prime
{
	public static void main(String args[])
	{
		int flag = 0;
		int num = Integer.parseInt(args[0]);
		
		for(int i=2; i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}