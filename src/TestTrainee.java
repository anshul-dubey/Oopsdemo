import java.util.Scanner;

class Trainee //class declaration
{
	int tId;             //define properties
	String tName;
	String technology;
	float salary;
	
	//define methods
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID, Name, Technology & Salary:");
		tId=s.nextInt();
		tName=s.next();
		technology=s.next();
		salary=s.nextFloat();
	}
	
	float calculate()
	{
		float stipend = salary-200;
		return stipend;
			
	}
	void display()
	{
		System.out.println("Trainee Details");
		System.out.println("Trainee ID: " +tId );
		System.out.println("Trainess Name: " +tName);
		System.out.println("Technology: " +technology);
		//System.out.println("Salary: " +salary);
	}
}
public class TestTrainee {

	public static void main(String[] args) {
	Trainee t1=new Trainee(); //creating objects of Trainee class
	Trainee t2=new Trainee();
	
	t1.input();  
	t2.input();//method call
	
	float s1=t1.calculate();
	float s2=t2.calculate();
	
	t1.display();
	System.out.println("Stipend:" +s1);
	t2.display();
	System.out.println("Stipend:" +s2);
	
	
	}

}
