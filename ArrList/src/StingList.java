import java.util.ArrayList;
import java.util.Iterator;

public class StingList {
	public static void printAll(ArrayList<String> a)
	{
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
	}
	public static void main(String [] args) {
		ArrayList<String> a = new ArrayList<String>(); 
		a.add("New ");
		a.add("String ");
		a.add("is ");
		a.add("This");
		printAll(a);
}}
