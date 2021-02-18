
public class Contact {
	
	void createContact()
	{
		
	}
	void createContact(String a, long num1)
	{
		System.out.println("Contact is:" +(a + num1));
	}
	void createContact(String b, long num2, long num3)
	
	{
		System.out.println("Conatct is:"+(b + num2 + num3));
	}

	public static void main(String[] args) {
		Contact c=new Contact();
		c.createContact("anshul ", 9999999999L);
		c.createContact("raj ", 98989898989L, 97979797979L);
		

	}

}
