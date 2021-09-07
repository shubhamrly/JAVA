package UsingList;


import java.util.*;

public class StringList {
	public static void printAll(LinkedList<String> a)
	{
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
	}
	public static void main(String [] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("New ");
		a.add("String ");
		a.add("is ");
		a.add("This");
		printAll(a);
	}
}
