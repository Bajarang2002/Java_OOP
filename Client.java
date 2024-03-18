

public class Client {
		
	public static void main(String [] args)
	{
	
	Mydate m1 = new Mydate();
	m1.display();
	
	Mydate m2= new Mydate(28,"Sept",2023);
	m2.display();
	
	Mydate m3 = new Mydate(29,"Aug");
	m3.display();
	
	Mydate m4 = new Mydate();
	m4.setDay(5);
	m4.setMonth("Jan");
	m4.setYear(2025);
	System.out.println(" Day is:"+m4.getDay());
	}
	
}

    

