
public class Thisdemo {
		
		int instVar;
		
		Thisdemo(int instVar)
		{
			this.instVar=instVar;
			System.out.println("This reference = "+ this);
			
		}

		public static void main(String[] args)
		{
			Thisdemo obj=new Thisdemo(8); //invokes constructor
			System.out.println("Object reference=" + obj);
	}

}
