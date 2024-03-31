
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectiondemo2 {
	public static void main(String [] args) {
		
		ArrayList numbers = new ArrayList();
		
		numbers.add(66);
		numbers.add(56);
		numbers.add(44);
		numbers.add(74);
		numbers.add(9);
		numbers.add(18);
		numbers.add(07);
		
		System.out.println("Number is:" +numbers);
		System.out.println("Number is:" +numbers.size());
		
		Collections.sort(numbers);
		
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}

		

    
		}
	
	
	}

