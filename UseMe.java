package useFul;
public class UseMe
{
	public void area(int l, int b)
	{
		System.out.println("Area of rectangle is: "+(l*b));
	}
	public void salary(double basicSal)
	{
		double ta = 0.1 * basicSal;
		double da = 0.2 * basicSal;
		double hra = 0.4 * basicSal;
		System.out.println("Salary is: "+(basicSal+ta+da+hra));
	}
	public void percentage(int TMarks, int OMarks)
	{
		double per = ((double)OMarks / (double)TMarks) * 100;
		System.out.println("Percentage is: "+per);
	}
}