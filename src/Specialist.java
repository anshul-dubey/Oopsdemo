
public class Specialist extends Doctor{

	protected String speciality;
	Specialist()
	{
	}
	
	Specialist(final String str,final int num, final String addr, final String special)
	{
		super(str,num,addr); //invoking base class constructor
		
		speciality=special;
	}

	void display()
	{
		super.display(); //call base class
		System.out.println("The speciality is:" +speciality);
	}



}
