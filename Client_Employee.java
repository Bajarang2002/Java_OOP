

public class Client_Employee {
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

}
    

