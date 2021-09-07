package UsingList;

import java.util.*;

public class llyear {
	public static void main(String [] args) {
	LinkedList<Integer> a = new LinkedList<Integer>();
	a.add(31);
	a.add(28);
	a.add(31);
	a.add(30);
	a.add(31);
	a.add(30);
	a.add(31);

	a.add(31);
	a.add(30);
	a.add(31);
	a.add(30);
	a.add(31);
	Iterator<Integer> i = a.iterator();
	Integer sum = 0;
	while(i.hasNext())
	{
		sum+= i.next();
		
	}
	System.out.println(sum);
	}
}
