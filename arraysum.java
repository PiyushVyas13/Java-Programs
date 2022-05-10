class ArraySum
{
	void minMaxSum(int arr[])
	{
		int temp, n=arr.length;
		int min_sum=0, max_sum=0;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
				    arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length-1; i++)
		{
			min_sum+=arr[i];
		}
		for(int i=1; i<arr.length; i++)
		{
			max_sum += arr[i];
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(min_sum + " " + max_sum);
		}
	}
	public static void main(String args[])
	{
		ArraySum as = new ArraySum();
		int[] a = {8, 12, 15, 51, 13};
		as.minMaxSum(a);
	}
}