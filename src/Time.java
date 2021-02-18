
public class Time {
	
	int hour;
	int min;
	int sec;
	
	public Time(int h, int m, int s)
	{
		hour=h;
		min=m;
		sec=s;
		
	}
	void add(Time obj2)
	{
		this.sec +=obj2.sec;
		this.min +=obj2.min;
		this.hour +=obj2.hour;
	}
	void check()
	{
		if(this.sec>=60)
		{
			this.min+=1;
			this.sec=this.sec-60;
		}
		if(this.min>=60)
		{
			this.hour+=1;
			this.min=this.min-60;
		}
		if(this.hour>=24)
		{
			this.hour=this.hour-24;
		}
		
	}
	void display()
	{
		System.out.println(this.hour + " : " +this.min +" : " +this.sec);
		
	}

	public static void main(String[] args) {
		
		Time obj1= new Time(10,2,30);
		Time obj2=new Time(11,5,45);
		System.out.println("Addition of the times :");
		obj1.add(obj2);
		obj1.check();
		obj1.display();

	}

}
