import java.util.Scanner;
class BMI
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight: ");
		double weight = sc.nextDouble();
		System.out.print("Enter your height: ");
		double height = sc.nextDouble();
		
		double bmi = weight/Math.pow(height, 2);
		
		if(bmi < 18.5)
		{
			System.out.println("You are underweight");
		}
		else if(bmi >= 18.5 && bmi <= 24.9)
		{
			System.out.println("You are of normal weight");
		}
		else if(bmi >= 25.0 && bmi <= 29.9)
		{
			System.out.println("You are overweight");
		}
		else if(bmi >= 30.0)
		{
			System.out.println("You are obese");
		}
	}
}