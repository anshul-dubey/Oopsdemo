/**  * This program demonstrates the Abstract Classes &Inheritance.   */


abstract class Employee5 {
    String name;
    double basic;
    String address;

     Employee5() {
    }

     Employee5(String str, double sal, String addr) {
        name = str;
        basic = sal;
        address = addr;
    }
        void show() {
        System.out.println("Name: \t\t\t" + name);
        System.out.println("Address: \t\t" + address);
        System.out.println("Basic: \t\t\t" + basic);
    }

    /** Abstract Method declaration.    */
    abstract double totalPay();

     double deduction(int leave) {
      double lessPay;

      if (leave <= 5) {
         lessPay = (0.25 * basic);
      } else {
         lessPay = (0.5 * basic);
      }
      return lessPay;
    }


/** Abstract Method declaration.    */
abstract double totalPay1();

 double deduction1(int leave) {
  double lessPay;

  if (leave <= 5) {
     lessPay = (0.25 * basic);
  } else {
     lessPay = (0.5 * basic);
  }
  return lessPay;
}
}

/**  * This class is a subclass of Employee.  */

class Manager1 extends Employee5 {

     String department;
    Manager1() {
    }
       Manager1(String str, double sal, String addr, String dept) {
        super(str, sal, addr);
        department = dept;
    }
      void show() {
        super.show();
        System.out.println("Department: \t\t" + department);
    }
       double totalPay() {
       double totalAmount = 0;
             double houseRentAllowance = (basic * 0.08);
             double dearnessAllowance = (basic * 0.3);
             double medicalAllowance = 1500;
             totalAmount = basic + houseRentAllowance
             + dearnessAllowance + medicalAllowance;
         return totalAmount;
    }
	@Override
	double totalPay1() {
		// TODO Auto-generated method stub
		return 0;
	}}

class Director1 extends Employee5 {
     double transportAllowance;
    Director1() {
    }

    Director1(String str, double sal, String addr,
    double allowance) {
        super(str, sal, addr);
        transportAllowance = allowance;
    }

    void show() {
        super.show();
        //System.out.println("Transport Allowance: \t" + transportAllowance);
    }

   double totalPay() {
       double totalAmount = 0;
       double houseRentAllowance = (basic * 0.20);
       double dearnessAllowance = (basic * 0.5);
       double medicalAllowance = 4500;
       double entertainmentAllowance = 5000;
       totalAmount = basic + houseRentAllowance + dearnessAllowance
             + medicalAllowance + entertainmentAllowance + transportAllowance;
       return totalAmount;
    }

@Override
double totalPay1() {
	// TODO Auto-generated method stub
	return 0;
}}



/** This class tests the object references.  */

class EmployeePay {
       

    public static void main(String[] args) {
       Manager1 mgrObj = new Manager1("Henry", 5500.65, "Sydney", "Accounts");
       double payTotal = mgrObj.totalPay();
       double less = mgrObj.deduction(5);
       double netPay = payTotal - less;
       System.out.println("\nManager Details");
       System.out.println("===================================");
       mgrObj.show();
       System.out.println("Total Pay: \t\t" + payTotal);
       System.out.println("Net Pay: \t\t" + netPay);

       Director1 dirObj = new Director1("Stephen", 32400.00, "New York",
       8000);
       payTotal = dirObj.totalPay();
       less = dirObj.deduction(5);
       netPay = payTotal - less;
       System.out.println("\n\nDirector Details");
       System.out.println("============================");
       dirObj.show();
       System.out.println("Total Pay: \t\t" + payTotal);
       System.out.println("Net Pay: \t\t" + netPay);
    }
}

