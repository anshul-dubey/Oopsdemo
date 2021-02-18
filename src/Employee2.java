
public class Employee2 {


	    
	    
	    
	    int salary;
	    int noHours;
	    Employee2(int s, int n){
	        this.salary=s;
	        this.noHours=n;
	    }
	    public void getInfo(){
	        System.out.println("Basic Salary"+salary);
	    
	        System.out.println("No. of hours "+noHours);
	        
	    }
	    public void AddSal() {
	        
	        if(salary<500) {
	            salary=salary+10;
	            
	        }
	    }
	    public void AddWork() {
	        
	        if(noHours>6) {
	            salary=salary+5;
	            
	        }
	    }
	        public void print() {
	            System.out.println("Final Salary"+salary);
	        }
	    
	    

	 

	    public static void main(String[] args) {
	    
	        Employee2 obj=new Employee2(5000,5);
	        Employee2 obj1=new Employee2(6000,6);
	        obj.getInfo();
	        obj.AddSal();
	        obj.AddWork();
	        obj.print();
	        
	        
	        obj1.getInfo();
	        obj1.AddSal();
	        obj1.AddWork();
	        obj1.print();
	    

	 

	    }

	 

}
