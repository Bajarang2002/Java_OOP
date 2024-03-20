

public class Rectangle extends Shape  {
	
	private int length;
	private int breadth;
	
public Rectangle(int l,int b)
{
	length =l;
	breadth =b;
}
public void calculatearea()
{
	double area;
	area = length*breadth;
	
	System.out.println("Area of Rectangle:"+area);
}
public void print()
{
	System.out.println("This is called rectangle class");
}

}

    

