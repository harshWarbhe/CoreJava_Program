import java.util.Scanner;
public class CricketTesting 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee detail: ");
		System.out.println("Employee First Name: ");
		String firstName = sc.nextLine();

		System.out.println("Employee Last Name: ");
		String lastName = sc.nextLine();

		System.out.println("Employee Employee Id: ");
		int employeeId = sc.nextInt();
		sc.nextLine();

		System.out.println("Employee Salary: ");
		double salary = sc.nextDouble();

		System.out.println("Employee no of Project: ");
		int  noOfProject = sc.nextInt();
		sc.nextLine();


		//Employee  = new Employee("hasrh","warbhe",18,10000,18);
		Batter b1 = new Batter(firstName,lastName,employeeId,salary,noOfProject);

		/* b1.firstName(hasrh);
		b1.lastName(warbhe);
		b1.employeeId(18);
		b1.salary(10000);
		b1.noOfProject(18); */

		b1.calculateSalary();
		b1.display();
		
	}
}

class Batter
{
	private String name ;
	private int runs;
	private int matches;
	private float battingAvg;
	

	Employee(String name, int runs,  int matches, float battingAvg)
	{
		this.name=name;
		this.runs=runs;
		this.matches=matches;
		this.battingAvg=battingAvg;
		
	}

	public void computeBattingAverage()
	{
		if (noOfProject>5 && noOfProject<=10)
		{
			salary += 5000;
		}else if (noOfProject>10 && noOfProject<=20)
		{
			salary += 10000;
		}else if (noOfProject>20)
		{
			salary =+ 15000;
		}
		else
			salary+=0;
	}

	public void display()
	{
		if (noOfProject>0)
		{
			System.out.println("Employee detail: ");
			System.out.println("Employee First Name: "+firstName);
			System.out.println("Employee Last Name: "+lastName);
			System.out.println("Employee Employee Id: "+employeeId);
			System.out.println("Employee Salary: "+salary);
			System.out.println("Employee no of Project: "+noOfProject);
		}
		else 
		{
			System.out.println("No. Of Project can't be less then 0");
		}
		
	}
}
