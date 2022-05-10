class Divide
{
	public static void main(String args[])
	{
		int count = 0, sum=0;
		
		for(int i=101; i<=200; i++)
		{
			if(i%7==0)
			{
				count = count + 1;
				sum = sum + i;
			}
		}
		System.out.println("No. of numbers divisible: "+count);
		System.out.println("Sum of numbers divisible: "+sum);
	}
}