

class Details
{
	String name;
	int yoj;
	String addr;


public Details(String name, int yoj,String addr)
{
	this.name=name;
	this.yoj=yoj;
	this.addr=addr;
}
void display()
{
	System.out.println(name+"  \t \t"+yoj+ "  \t\t"+addr);
		
}
}


public class Employee1 {

	public static void main(String[] args) {
		
		System.out.println("NAME \t YEAR OF JOINING \t Address");
		
		Details d1= new Details("Rober",1995,"64-c Wallstreet");
		Details d2= new Details("Sam",2000,"64-D Wallstreet");
		Details d3= new Details("John",1999,"64Bc Wallstreet");
		
		d1.display();
		d2.display();
		d3.display();
		
		
		
	}

}
