class Neven
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		
		for(int i = n; i <= n*10; i++)
		{
			if(i % n == 0)
			{
				System.out.println(i);
			}
		}
	}
}