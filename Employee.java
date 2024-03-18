

public class Employee {
	public static void main(String [] args)
	{
		Employee e1 =new Employee();
		Employee.setCompany("Wipro");
		e1.displayData();
		System.out.println("Salary is:"+e1.calculatesalary());
		
		System.out.println("===============================================");
		
		Employee e2 =new Employee(102,"Raj",70000,"Manager"," Infosis");
		e2.displayData();
		System.out.println("Salary is:"+e2.calculatesalary());
		System.out.println("===============================================");
		
		Employee e3=new Employee(103,"Pavan",40000,"SalesManager"," HCl");
		e3.displayData();
		System.out.println("Salary is:"+e3.calculatesalary());
		System.out.println("===============================================");
	}

	
	
	private int empid;
	private String empname;
	private double basicsalary;
    private String designation;
	private static String company;
	
public static void setCompany(String c)
{
	company= c;
} 
	
 public Employee()
 {
	this.empid= 101;
	this.empname="Ram";
	this.basicsalary=50000;
	this.designation= "Team leads";
	this.company ="TCS";
 }
public Employee(int eid, String ename,double bs,String dg,String cp)
{
	this.empid =eid;
	this.empname= ename;
	this.basicsalary= bs;
	this.designation=dg;
	this.company =cp;
}
public double calculatesalary()
{
	double da,hra,pf,net;
	da = basicsalary *0.50;
	hra=basicsalary *0.20;
	pf= basicsalary *0.05;
	net=basicsalary+ da+hra-pf;
	return net;
}
public void displayData()
{
	System.out.println("EmpId is:"+empid);
	System.out.println("Emp name is:"+empname);
	System.out.println("Emp salary is:"+basicsalary);
	System.out.println("Emp designation is:"+designation);
	System.out.println("Emp company is:"+company);

}
}

    

