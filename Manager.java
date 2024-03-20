

public class Manager extends Employee
{
	
	private double sales;
	private double rateofcom;
	
public Manager()
{
	sales =0;
	rateofcom=0;
	
}
public Manager(int id,String ename,double bs,String dg,String cp, double s,double roc)
{
	super(id,ename,bs,dg,cp);
	sales=s;
	rateofcom=roc;
	
}
public double calculatesalary()
{
	double insentive =sales* rateofcom;
	double Net = insentive +super.calculatesalary();
	return Net;
}
public void display()
{
	super.displayData();
	System.out.println("Sales is:"+sales);
	System.out.println("Rate of commision is:"+rateofcom);
}


	

}

    

