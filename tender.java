import java.util.Scanner;
class Tender
{
	String name;
	int cost;
	Scanner sc = new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Company Name:");
		name = sc.next();
		System.out.println("Enter Cost:");
		cost = sc.nextInt();
		System.out.println("--------------------------");
	}
	void display()
	{
		System.out.println(name);
		System.out.println("Cost: "+cost);
		
	}
}
class TenderMain
{
	public static void main(String args[])
	{
		Tender t[] = new Tender[3];
		for(int i=0; i<t.length; i++)
		{
			t[i] = new Tender();
		}
		for(int i=0; i<t.length; i++)
		{
			t[i].getData();
		}
		System.out.print("Name of the company with lowest cost: ");
		for(int i=0; i<t.length-1; i++)
		{
			for(int j=0; j<t.length-i-1; j++)
			{
				if(t[j].cost>t[j+1].cost)
				{
					Tender temp = t[j];
					t[j] = t[j+1];
					t[j+1] = temp;
				}
			}
		}
		t[0].display();
	}
}