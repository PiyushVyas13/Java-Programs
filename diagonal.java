class Diagonal 
{
	public static void main(String args[])
	{
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		int rdiagonal[] = new int[matrix.length];
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=matrix.length-1; j>=0; j--)
			{
				System.out.println(matrix[i][j]);
				break;
			}
		}
	}
}
