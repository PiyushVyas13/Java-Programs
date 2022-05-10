class StringDemo
{
	public static void main(String args[])
	{
		String s = "JACK";
		String s1 = "DANIEL";
		char c1[] = new char[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			c1[i] = s.charAt(i);
		}
		
		for(int i=0; i<c1.length;i++)
		{
			System.out.println(c1[i]);
		}
	}
}