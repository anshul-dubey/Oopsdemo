import java.util.Scanner;

class Student
{

    int rollno;
	String name;
	String course;
	int marks;
	Scanner s;
	int n;


void input()
{
	 s=new Scanner(System.in);
	 
	 System.out.println("Enter number of students:");
	 n=s.nextInt();
	 
	System.out.println("Enter roll number, name, course and marks:");
	 rollno=s.nextInt();
	 name=s.next();
	 course=s.next();
	 marks=s.nextInt();
	 
}

}






