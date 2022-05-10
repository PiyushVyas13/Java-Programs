import java.util.Scanner;
class Student
{
	String name;
	int roll_no;
	double percentage;
	Scanner sc = new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter your Name");
		name = sc.next();
		System.out.println("Enter your Roll No");
		roll_no = sc.nextInt();
		System.out.println("Enter your percentage");
		percentage = sc.nextDouble();
		System.out.println("-----------------------------");
	}
	
	
}
class StudentMain
{
	public static void main(String args[])
	{
		Student s[] = new Student[5];
		for(int i = 0; i<s.length; i++)
		{
			s[i] = new Student();
		}
		for(int i = 0; i<s.length; i++)
		{
			System.out.println("Enter details for Student "+(i+1));
			s[i].getData();
		}
		System.out.println("Merit list is as follows: ");
		for(int i = 0; i<s.length-1; i++)
		{
			for(int j = 0; j<s.length-i-1; j++)
			{
				if(s[j].percentage < s[j+1].percentage)
				{
					Student temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		for(int i=0; i<s.length; i++)
		{
			System.out.println("Merit No. "+(i+1));
			System.out.println("Name: "+s[i].name);
			System.out.println("Roll No.: "+s[i].roll_no);
			System.out.println("-----------------------------");
		}
	}
}