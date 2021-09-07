import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
public static void main(String [] args) {
	ArrayList<Integer> a = new ArrayList<Integer>(); 
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
}}
