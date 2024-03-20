
    public class Circle extends Shape 
{
	
private int rd;
	
public Circle(int rd)
{
	
    this.rd=rd;
}
public void  calculatearea()
{
	double area;
	area = 3.14*rd*rd;
	
	System.out.println(" Area of circle:"+area);
}
public void print()
{
	System.out.println("This is circle class");
}
}




    

