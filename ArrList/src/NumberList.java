import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {
	public static void main(String [] args) {
	
	  	ArrayList<? super Number> a = new ArrayList<>();
	  	a.add(12);
	  	a.add(12.0);
	  	a.add(12.0001);
	  	Iterator<? super Number> i = a.iterator();
	  	
	  	while(i.hasNext())
	  	{System.out.println(i.next());
	  	
	  		
	  	}
	  	
	}
}
