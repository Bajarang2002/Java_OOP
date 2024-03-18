

public class Mydate {
	
	 private int day;
	 private String month;
	 private int year;



public Mydate()
{
	day =25;
	month ="Feb";
	year =2024;
	System.out.println("Default constucter");
}
public Mydate(int d, String m,int y )
{
	day = d;
	month =m;
	year =y;
	System.out.println("Parameterised constructer");
}

public Mydate(int d,String m)
{
	day =d;
	month=m;
	year =2025;
}
public int getDay()
{
	return day;
}

public void setDay(int d)
{
	day =d;
}
public void  setMonth(String m)
{
	month = m;
}
public void setYear(int y)
{
	year =y;
}
public void display()
{
	System.out.println("Mydate is:"+day +"-"+month+"-"
			+ ""+year);
}
}
 
