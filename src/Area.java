import java.util.Scanner;

public class Area {
	
	int length,breadth;
	Area()
	{
	        
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter lentgth:");
	        length=s.nextInt();
	        System.out.println("Enter breadth:");
	        breadth=s.nextInt();
	
	}
	public int area(){
		int area = length * breadth;
		return area;
		}
		 public void getArea(){
		System.out.println("Area = " +  area());
		}
		 
		 
	public static void main(String[] args) {
		Area a=new Area();
		a.getArea();
	}

}
