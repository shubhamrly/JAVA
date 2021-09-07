package usingVector;

import java.util.*;


public class Vect {
	public static void main(String [] args) {
		Vector <Integer> a = new Vector<Integer>();
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
