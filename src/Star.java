
public class Star {

	public static void main(String[] args) {
		
		int i,j,n=5;
		
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=n-i;j++)
		 
		{
		System.out.print(" ");
		}
		 
		for(j=1;j<=i*2-1;j++)
		 
		{
		System.out.print("*");
		}
		System.out.println();
		 
		} 
		for(i=n-1;i>0;i--)
		{
		for(j=1;j<=n-i;j++)
		 
		{
		System.out.print(" ");
		}
		for(j=1;j<=i*2-1;j++)
		 
		{
		System.out.print("*");
		}
		System.out.println();
		}

	}

}
